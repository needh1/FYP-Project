import os
import re
import csv
from collections import defaultdict
import sys
import antlr4
current_dir = os.path.dirname(os.path.abspath(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, '..'))
sys.path.insert(0, parent_dir)
from generated.SolidityLexer import SolidityLexer
from generated.SolidityParser import SolidityParser
from generated.SolidityListener import SolidityListener

# Function pattern for regex-based detection
function_pattern = re.compile(
    r"""
    function
    \s+([^\s({]+)                      # func name
    \s*\(([^)]*)\)                     # parameters
    \s+(public|external                # visibility is mandatory
        (?:\s+(?:view|pure|payable))*)? # optionally view/pure/payable
    \s*(returns\s*\([^\)]*\))?         # optional 'returns(...)'
    \s*\{([\s\S]*?)\}                  # function body
    """,
    re.IGNORECASE | re.DOTALL | re.VERBOSE
)

modifier_pattern = re.compile(
    r"modifier\s+([^\s(]+)\s*\((.*?)\)?\s*\{(.*?)\}",
    re.DOTALL
)

require_pattern = re.compile(
    r"require\((.*?)\)",
    re.DOTALL
)

conditional_pattern = re.compile(
    r'\bif\s*\(\s*(!?hasRole\([^)]*\)|msg\.sender\s*(==|!=)\s*\w+)\)\s*(revert|throw)\b',
    re.IGNORECASE
)

# Enhanced patterns for role detection
role_patterns = [
    # Standard OpenZeppelin patterns
    r'onlyOwner',
    r'onlyRole\((.*?)\)',
    
    # Common role check patterns
    r'hasRole\((.*?),(.*?)\)',
    r'require\s*\(\s*msg\.sender\s*==\s*(\w+)',
    r'require\s*\(\s*(\w+)\(msg\.sender\)',
    r'onlyBy',
    r'onlyAdmin',
    r'onlyGovernance',
    
    # Custom modifiers often indicate access control
    r'(?:modifier|function)[^{]*\b(only\w+)\b'
]

role_regexes = [re.compile(pattern, re.IGNORECASE) for pattern in role_patterns]

# Common role-related keywords to look for
role_keywords = [
    'admin', 'owner', 'manager', 'controller',
    'minter', 'burner', 'pauser', 'upgrader',
    'vault', 'treasurer', 'guardian', 'governance',
    'authority', 'operator', 'migrator', 'distributor'
]

class ModifiedFunctionListener(SolidityListener):
    def __init__(self):
        self.contracts = defaultdict(lambda: {"isOwnable": False, "isAccessControl": False})
        self.current_contract = None
        self.current_function = None
        self.functions = {}
        self.modifiers = {}
        self.state_variables = set()
        
    def enterContractDefinition(self, ctx):
        self.current_contract = ctx.identifier().getText()
        # Check for inheritance from Ownable or AccessControl
        for spec in ctx.inheritanceSpecifier():
            base_name = spec.userDefinedTypeName().getText()
            if base_name == "Ownable":
                self.contracts[self.current_contract]["isOwnable"] = True
            if base_name == "AccessControl":
                self.contracts[self.current_contract]["isAccessControl"] = True
                
    def exitContractDefinition(self, ctx):
        self.current_contract = None
        
    def enterModifierDefinition(self, ctx):
        modifier_name = ctx.identifier().getText() if ctx.identifier() else None
        if modifier_name:
            self.modifiers[modifier_name] = {
                'source': ctx.getText(),
                'contract': self.current_contract,
                'is_role_related': any(kw.lower() in modifier_name.lower() for kw in role_keywords)
            }
            
    def enterFunctionDefinition(self, ctx):
        fn_descriptor = ctx.functionDescriptor()
        fn_name = None
        
        # Extract function name based on type
        if fn_descriptor:
            if fn_descriptor.ConstructorKeyword():
                fn_name = "constructor"
            elif fn_descriptor.FallbackKeyword():
                fn_name = "fallback"
            elif fn_descriptor.ReceiveKeyword():
                fn_name = "receive"
            else:
                for child in fn_descriptor.getChildren():
                    if isinstance(child, SolidityParser.IdentifierContext):
                        fn_name = child.getText()
                        break
        
        if not fn_name:
            fn_name = "anonymous_function"
            
        self.current_function = fn_name
        
        # Initialize function data
        self.functions[fn_name] = {
            'modifiers': set(),
            'is_public': False,
            'is_external': False,
            'is_view': False,
            'is_pure': False,
            'role_checks': set(),
            'requires': set(),
            'source': ctx.getText(),
            'contract': self.current_contract
        }
        
        # Extract modifiers and visibility
        modifier_list = ctx.modifierList()
        if modifier_list:
            for child in modifier_list.getChildren():
                if isinstance(child, SolidityParser.ModifierInvocationContext):
                    modifier_name = child.getText()
                    self.functions[fn_name]['modifiers'].add(modifier_name)
                    
                    # Check if this is a role-related modifier
                    base_modifier = re.sub(r'\(.*\)', '', modifier_name)
                    if any(kw.lower() in base_modifier.lower() for kw in role_keywords):
                        self.functions[fn_name]['role_checks'].add(f"modifier:{modifier_name}")
                else:
                    # Check for visibility modifiers
                    text = child.getText().lower()
                    if text == "public":
                        self.functions[fn_name]['is_public'] = True
                    elif text == "external":
                        self.functions[fn_name]['is_external'] = True
                    elif text == "view":
                        self.functions[fn_name]['is_view'] = True
                    elif text == "pure":
                        self.functions[fn_name]['is_pure'] = True
                        
    def exitFunctionDefinition(self, ctx):
        self.current_function = None
        
    def enterStateVariableDeclaration(self, ctx):
        for child in ctx.getChildren():
            if isinstance(child, SolidityParser.IdentifierContext):
                variable_name = child.getText()
                self.state_variables.add(variable_name)
                
    def get_summary(self):
        """Return a summary of the contract's security-relevant aspects"""
        return {
            "contracts": dict(self.contracts),
            "functions": self.functions,
            "modifiers": self.modifiers,
            "state_variables": list(self.state_variables)
        }

def antlr_parse(file_path):
    """Parse the Solidity file using ANTLR4 and return the listener with analysis results"""
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            code = f.read()
            
        input_stream = antlr4.InputStream(code)
        lexer = SolidityLexer(input_stream)
        lexer.removeErrorListeners()
        token_stream = antlr4.CommonTokenStream(lexer)
        parser = SolidityParser(token_stream)
        parser.removeErrorListeners()
        tree = parser.sourceUnit()
        
        listener = ModifiedFunctionListener()
        walker = antlr4.ParseTreeWalker()
        walker.walk(listener, tree)
        
        return listener, code
    except Exception as e:
        print(f"Error parsing {file_path}: {e}")
        return None, None

def regex_extract_roles(code, file_path):
    """Extract roles using regex patterns"""
    roles_permissions = []
    
    # Find functions
    func_matches = function_pattern.findall(code)
    for func_match in func_matches:
        if len(func_match) < 5:
            # pad with empty strings
            func_match = func_match + ("",) * (5 - len(func_match))
        
        func_name, params, visibility, returns_clause, body = func_match
        func_name = func_name.strip()
        
        if not body.strip():
            continue
            
        # Find require statements
        req_matches = require_pattern.findall(body)
        for req in req_matches:
            roles_permissions.append((file_path, "Require", func_name, req.strip()))
            
            # Check if it's a role check
            if "msg.sender" in req:
                roles_permissions.append((file_path, "RoleCheck", func_name, f"require:{req.strip()}"))
                
        # Find modifier invocations
        modifier_invocations = re.findall(r'(only\w+)[\s(]', body)
        for mod in modifier_invocations:
            roles_permissions.append((file_path, "ModifierInvocation", func_name, mod))
            
        # Find conditional access checks
        if_checks = conditional_pattern.findall(body)
        for check in if_checks:
            roles_permissions.append((file_path, "InlineCheck", func_name, str(check[0])))
            
    # Find modifier definitions
    modifier_defs = modifier_pattern.findall(code)
    for mod_match in modifier_defs:
        mod_name, params, body = mod_match
        if any(kw.lower() in mod_name.lower() for kw in role_keywords):
            roles_permissions.append((file_path, "ModifierDefinition", mod_name, body[:50] + "..."))
            
    return roles_permissions

def check_openzeppelin_import(code):
    """Check if the contract imports OpenZeppelin access control contracts"""
    oz_imports = [
        "import '@openzeppelin/contracts/access/Ownable.sol'",
        "import \"@openzeppelin/contracts/access/Ownable.sol\"",
        "import '@openzeppelin/contracts/access/AccessControl.sol'",
        "import \"@openzeppelin/contracts/access/AccessControl.sol\"",
        "import '@openzeppelin/contracts/access/AccessControlEnumerable.sol'",
        "import \"@openzeppelin/contracts/access/AccessControlEnumerable.sol\""
    ]
    
    for imp in oz_imports:
        if imp in code:
            return True
    return False

def analyze_contract(file_path):
    """Analyze a Solidity contract for role-based access control"""
    listener, code = antlr_parse(file_path)
    if not listener or not code:
        return []
        
    results = []
    
    # Check if contract uses OpenZeppelin
    uses_oz = check_openzeppelin_import(code)
    
    # Get AST-based results
    summary = listener.get_summary()
    
    # Process functions
    for func_name, func_data in summary["functions"].items():
        # Skip view/pure functions as they don't modify state
        if func_data['is_view'] or func_data['is_pure']:
            continue
            
        # Check if function is public or external (part of external API)
        if func_data['is_public'] or func_data['is_external']:
            # Check for modifiers or role checks
            if func_data['modifiers']:
                for mod in func_data['modifiers']:
                    # Extract base modifier name without arguments
                    base_mod = re.sub(r'\(.*\)', '', mod)
                    
                    # Check if it's a role-related modifier
                    if 'only' in base_mod.lower() or any(kw.lower() in base_mod.lower() for kw in role_keywords):
                        results.append((file_path, "AST_Modifier", func_name, mod, str(uses_oz)))
            
            # If no role-related modifiers, mark as potentially vulnerable
            if not any('only' in mod.lower() or any(kw.lower() in mod.lower() for kw in role_keywords) 
                      for mod in func_data['modifiers']):
                results.append((file_path, "PotentiallyVulnerable", func_name, "Public/external function without role checks", str(uses_oz)))
    
    # Process modifiers
    for mod_name, mod_data in summary["modifiers"].items():
        if mod_data['is_role_related']:
            results.append((file_path, "RoleModifier", mod_name, "Role-based access control modifier", str(uses_oz)))
    
    # Get regex-based results
    regex_results = regex_extract_roles(code, file_path)
    
    # Combine results
    all_results = results + regex_results
    
    return all_results

def extract_roles_from_files():
    """Extract roles from all Solidity files in the Data directory"""
    # Create output directory if it doesn't exist
    os.makedirs('Roles', exist_ok=True)
    
    output_csv = 'Roles/roles_permissions.csv'
    
    with open(output_csv, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Path', 'Type', 'Functions', 'Role', 'isOZ'])
        
        # Find all .sol files in Data directory
        file_count = 0
        for root, _, files in os.walk('./Data'):
            for file in files:
                if file.endswith('.sol'):
                    file_count += 1
                    path = os.path.join(root, file)
                    print(f"Processing [{file_count}]: {path}")
                    
                    # Analyze the contract
                    results = analyze_contract(path)
                    
                    # Write results to CSV
                    for result in results:
                        writer.writerow(result)
    
    print(f"Processed {file_count} files. Results written to {output_csv}")

if __name__ == '__main__':
    extract_roles_from_files()