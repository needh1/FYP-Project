// Generated from /Users/nidhi/FYP/Antlr4/grammar/Solidity.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, Int=97, Uint=98, Byte=99, Fixed=100, Ufixed=101, BooleanLiteral=102, 
		DecimalNumber=103, HexNumber=104, NumberUnit=105, HexLiteralFragment=106, 
		ReservedKeyword=107, AnonymousKeyword=108, BreakKeyword=109, ConstantKeyword=110, 
		TransientKeyword=111, ImmutableKeyword=112, ContinueKeyword=113, LeaveKeyword=114, 
		ExternalKeyword=115, IndexedKeyword=116, InternalKeyword=117, PayableKeyword=118, 
		PrivateKeyword=119, PublicKeyword=120, VirtualKeyword=121, PureKeyword=122, 
		TypeKeyword=123, ViewKeyword=124, GlobalKeyword=125, ConstructorKeyword=126, 
		FallbackKeyword=127, ReceiveKeyword=128, Identifier=129, StringLiteralFragment=130, 
		VersionLiteral=131, WS=132, COMMENT=133, LINE_COMMENT=134;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_pragmaValue = 3, 
		RULE_version = 4, RULE_versionOperator = 5, RULE_versionConstraint = 6, 
		RULE_importDeclaration = 7, RULE_importDirective = 8, RULE_importPath = 9, 
		RULE_contractDefinition = 10, RULE_inheritanceSpecifier = 11, RULE_contractPart = 12, 
		RULE_stateVariableDeclaration = 13, RULE_fileLevelConstant = 14, RULE_customErrorDefinition = 15, 
		RULE_typeDefinition = 16, RULE_usingForDeclaration = 17, RULE_usingForObject = 18, 
		RULE_usingForObjectDirective = 19, RULE_userDefinableOperators = 20, RULE_structDefinition = 21, 
		RULE_modifierDefinition = 22, RULE_modifierInvocation = 23, RULE_functionDefinition = 24, 
		RULE_functionDescriptor = 25, RULE_returnParameters = 26, RULE_modifierList = 27, 
		RULE_eventDefinition = 28, RULE_enumValue = 29, RULE_enumDefinition = 30, 
		RULE_parameterList = 31, RULE_parameter = 32, RULE_eventParameterList = 33, 
		RULE_eventParameter = 34, RULE_functionTypeParameterList = 35, RULE_functionTypeParameter = 36, 
		RULE_variableDeclaration = 37, RULE_typeName = 38, RULE_userDefinedTypeName = 39, 
		RULE_mappingKey = 40, RULE_mapping = 41, RULE_mappingKeyName = 42, RULE_mappingValueName = 43, 
		RULE_functionTypeName = 44, RULE_storageLocation = 45, RULE_stateMutability = 46, 
		RULE_block = 47, RULE_statement = 48, RULE_expressionStatement = 49, RULE_ifStatement = 50, 
		RULE_tryStatement = 51, RULE_catchClause = 52, RULE_whileStatement = 53, 
		RULE_simpleStatement = 54, RULE_uncheckedStatement = 55, RULE_forStatement = 56, 
		RULE_inlineAssemblyStatement = 57, RULE_inlineAssemblyStatementFlag = 58, 
		RULE_doWhileStatement = 59, RULE_continueStatement = 60, RULE_breakStatement = 61, 
		RULE_returnStatement = 62, RULE_throwStatement = 63, RULE_emitStatement = 64, 
		RULE_revertStatement = 65, RULE_variableDeclarationStatement = 66, RULE_variableDeclarationList = 67, 
		RULE_identifierList = 68, RULE_elementaryTypeName = 69, RULE_expression = 70, 
		RULE_primaryExpression = 71, RULE_expressionList = 72, RULE_nameValueList = 73, 
		RULE_nameValue = 74, RULE_functionCallArguments = 75, RULE_functionCall = 76, 
		RULE_assemblyBlock = 77, RULE_assemblyItem = 78, RULE_assemblyExpression = 79, 
		RULE_assemblyMember = 80, RULE_assemblyCall = 81, RULE_assemblyLocalDefinition = 82, 
		RULE_assemblyAssignment = 83, RULE_assemblyIdentifierOrList = 84, RULE_assemblyIdentifierList = 85, 
		RULE_assemblyStackAssignment = 86, RULE_labelDefinition = 87, RULE_assemblySwitch = 88, 
		RULE_assemblyCase = 89, RULE_assemblyFunctionDefinition = 90, RULE_assemblyFunctionReturns = 91, 
		RULE_assemblyFor = 92, RULE_assemblyIf = 93, RULE_assemblyLiteral = 94, 
		RULE_tupleExpression = 95, RULE_numberLiteral = 96, RULE_identifier = 97, 
		RULE_hexLiteral = 98, RULE_overrideSpecifier = 99, RULE_stringLiteral = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
			"versionOperator", "versionConstraint", "importDeclaration", "importDirective", 
			"importPath", "contractDefinition", "inheritanceSpecifier", "contractPart", 
			"stateVariableDeclaration", "fileLevelConstant", "customErrorDefinition", 
			"typeDefinition", "usingForDeclaration", "usingForObject", "usingForObjectDirective", 
			"userDefinableOperators", "structDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "functionDescriptor", "returnParameters", "modifierList", 
			"eventDefinition", "enumValue", "enumDefinition", "parameterList", "parameter", 
			"eventParameterList", "eventParameter", "functionTypeParameterList", 
			"functionTypeParameter", "variableDeclaration", "typeName", "userDefinedTypeName", 
			"mappingKey", "mapping", "mappingKeyName", "mappingValueName", "functionTypeName", 
			"storageLocation", "stateMutability", "block", "statement", "expressionStatement", 
			"ifStatement", "tryStatement", "catchClause", "whileStatement", "simpleStatement", 
			"uncheckedStatement", "forStatement", "inlineAssemblyStatement", "inlineAssemblyStatementFlag", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "revertStatement", "variableDeclarationStatement", 
			"variableDeclarationList", "identifierList", "elementaryTypeName", "expression", 
			"primaryExpression", "expressionList", "nameValueList", "nameValue", 
			"functionCallArguments", "functionCall", "assemblyBlock", "assemblyItem", 
			"assemblyExpression", "assemblyMember", "assemblyCall", "assemblyLocalDefinition", 
			"assemblyAssignment", "assemblyIdentifierOrList", "assemblyIdentifierList", 
			"assemblyStackAssignment", "labelDefinition", "assemblySwitch", "assemblyCase", 
			"assemblyFunctionDefinition", "assemblyFunctionReturns", "assemblyFor", 
			"assemblyIf", "assemblyLiteral", "tupleExpression", "numberLiteral", 
			"identifier", "hexLiteral", "overrideSpecifier", "stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'*'", "'||'", "'^'", "'~'", "'>='", "'>'", 
			"'<'", "'<='", "'='", "'as'", "'import'", "'from'", "'{'", "','", "'}'", 
			"'abstract'", "'contract'", "'interface'", "'library'", "'is'", "'('", 
			"')'", "'error'", "'using'", "'for'", "'|'", "'&'", "'+'", "'-'", "'/'", 
			"'%'", "'=='", "'!='", "'struct'", "'modifier'", "'function'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", 
			"'memory'", "'storage'", "'calldata'", "'if'", "'else'", "'try'", "'catch'", 
			"'while'", "'unchecked'", "'assembly'", "'do'", "'return'", "'throw'", 
			"'emit'", "'revert'", "'var'", "'bool'", "'string'", "'byte'", "'++'", 
			"'--'", "'new'", "':'", "'delete'", "'!'", "'**'", "'<<'", "'>>'", "'&&'", 
			"'?'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", "'case'", "'default'", 
			"'->'", "'callback'", "'override'", null, null, null, null, null, null, 
			null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
			"'transient'", "'immutable'", "'continue'", "'leave'", "'external'", 
			"'indexed'", "'internal'", "'payable'", "'private'", "'public'", "'virtual'", 
			"'pure'", "'type'", "'view'", "'global'", "'constructor'", "'fallback'", 
			"'receive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Int", "Uint", "Byte", "Fixed", "Ufixed", "BooleanLiteral", "DecimalNumber", 
			"HexNumber", "NumberUnit", "HexLiteralFragment", "ReservedKeyword", "AnonymousKeyword", 
			"BreakKeyword", "ConstantKeyword", "TransientKeyword", "ImmutableKeyword", 
			"ContinueKeyword", "LeaveKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"VirtualKeyword", "PureKeyword", "TypeKeyword", "ViewKeyword", "GlobalKeyword", 
			"ConstructorKeyword", "FallbackKeyword", "ReceiveKeyword", "Identifier", 
			"StringLiteralFragment", "VersionLiteral", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<EventDefinitionContext> eventDefinition() {
			return getRuleContexts(EventDefinitionContext.class);
		}
		public EventDefinitionContext eventDefinition(int i) {
			return getRuleContext(EventDefinitionContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<FileLevelConstantContext> fileLevelConstant() {
			return getRuleContexts(FileLevelConstantContext.class);
		}
		public FileLevelConstantContext fileLevelConstant(int i) {
			return getRuleContext(FileLevelConstantContext.class,i);
		}
		public List<CustomErrorDefinitionContext> customErrorDefinition() {
			return getRuleContexts(CustomErrorDefinitionContext.class);
		}
		public CustomErrorDefinitionContext customErrorDefinition(int i) {
			return getRuleContext(CustomErrorDefinitionContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<UsingForDeclarationContext> usingForDeclaration() {
			return getRuleContexts(UsingForDeclarationContext.class);
		}
		public UsingForDeclarationContext usingForDeclaration(int i) {
			return getRuleContext(UsingForDeclarationContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__25) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << T__45) | (1L << T__49) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__94 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (LeaveKeyword - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (GlobalKeyword - 64)) | (1L << (ConstructorKeyword - 64)) | (1L << (FallbackKeyword - 64)))) != 0) || _la==ReceiveKeyword || _la==Identifier) {
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(202);
					pragmaDirective();
					}
					break;
				case 2:
					{
					setState(203);
					importDirective();
					}
					break;
				case 3:
					{
					setState(204);
					contractDefinition();
					}
					break;
				case 4:
					{
					setState(205);
					enumDefinition();
					}
					break;
				case 5:
					{
					setState(206);
					eventDefinition();
					}
					break;
				case 6:
					{
					setState(207);
					structDefinition();
					}
					break;
				case 7:
					{
					setState(208);
					functionDefinition();
					}
					break;
				case 8:
					{
					setState(209);
					fileLevelConstant();
					}
					break;
				case 9:
					{
					setState(210);
					customErrorDefinition();
					}
					break;
				case 10:
					{
					setState(211);
					typeDefinition();
					}
					break;
				case 11:
					{
					setState(212);
					usingForDeclaration();
					}
					break;
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__0);
			setState(221);
			pragmaName();
			setState(222);
			pragmaValue();
			setState(223);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaValue);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				version();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			versionConstraint();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || _la==DecimalNumber || _la==VersionLiteral) {
				{
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(233);
					match(T__3);
					}
				}

				setState(236);
				versionConstraint();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionConstraint);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(244);
					versionOperator();
					}
				}

				setState(247);
				match(VersionLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(248);
					versionOperator();
					}
				}

				setState(251);
				match(DecimalNumber);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			identifier();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(255);
				match(T__11);
				setState(256);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDirectiveContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDirective);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__12);
				setState(260);
				importPath();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(261);
					match(T__11);
					setState(262);
					identifier();
					}
				}

				setState(265);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__12);
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(268);
					match(T__2);
					}
					break;
				case T__13:
				case T__24:
				case T__43:
				case T__49:
				case T__61:
				case T__94:
				case LeaveKeyword:
				case PayableKeyword:
				case GlobalKeyword:
				case ConstructorKeyword:
				case ReceiveKeyword:
				case Identifier:
					{
					setState(269);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(272);
					match(T__11);
					setState(273);
					identifier();
					}
				}

				setState(276);
				match(T__13);
				setState(277);
				importPath();
				setState(278);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(T__12);
				setState(281);
				match(T__14);
				setState(282);
				importDeclaration();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(283);
					match(T__15);
					setState(284);
					importDeclaration();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				match(T__16);
				setState(291);
				match(T__13);
				setState(292);
				importPath();
				setState(293);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(StringLiteralFragment);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(299);
				match(T__17);
				}
			}

			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(303);
			identifier();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(304);
				match(T__21);
				setState(305);
				inheritanceSpecifier();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(306);
					match(T__15);
					setState(307);
					inheritanceSpecifier();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(315);
			match(T__14);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__25 - 14)) | (1L << (T__35 - 14)) | (1L << (T__36 - 14)) | (1L << (T__37 - 14)) | (1L << (T__39 - 14)) | (1L << (T__40 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (TypeKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (FallbackKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				{
				setState(316);
				contractPart();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			userDefinedTypeName();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(325);
				match(T__22);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
					{
					setState(326);
					expressionList();
					}
				}

				setState(329);
				match(T__23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public CustomErrorDefinitionContext customErrorDefinition() {
			return getRuleContext(CustomErrorDefinitionContext.class,0);
		}
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contractPart);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				modifierDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				functionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				eventDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				enumDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				customErrorDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
				typeDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> TransientKeyword() { return getTokens(SolidityParser.TransientKeyword); }
		public TerminalNode TransientKeyword(int i) {
			return getToken(SolidityParser.TransientKeyword, i);
		}
		public List<TerminalNode> ImmutableKeyword() { return getTokens(SolidityParser.ImmutableKeyword); }
		public TerminalNode ImmutableKeyword(int i) {
			return getToken(SolidityParser.ImmutableKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			typeName(0);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (ConstantKeyword - 96)) | (1L << (TransientKeyword - 96)) | (1L << (ImmutableKeyword - 96)) | (1L << (InternalKeyword - 96)) | (1L << (PrivateKeyword - 96)) | (1L << (PublicKeyword - 96)))) != 0)) {
				{
				setState(351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(344);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(345);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(346);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(347);
					match(ConstantKeyword);
					}
					break;
				case TransientKeyword:
					{
					setState(348);
					match(TransientKeyword);
					}
					break;
				case ImmutableKeyword:
					{
					setState(349);
					match(ImmutableKeyword);
					}
					break;
				case T__95:
					{
					setState(350);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			identifier();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(357);
				match(T__10);
				setState(358);
				expression(0);
				}
			}

			setState(361);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileLevelConstantContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FileLevelConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileLevelConstant; }
	}

	public final FileLevelConstantContext fileLevelConstant() throws RecognitionException {
		FileLevelConstantContext _localctx = new FileLevelConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fileLevelConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			typeName(0);
			setState(364);
			match(ConstantKeyword);
			setState(365);
			identifier();
			setState(366);
			match(T__10);
			setState(367);
			expression(0);
			setState(368);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomErrorDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CustomErrorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customErrorDefinition; }
	}

	public final CustomErrorDefinitionContext customErrorDefinition() throws RecognitionException {
		CustomErrorDefinitionContext _localctx = new CustomErrorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_customErrorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__24);
			setState(371);
			identifier();
			setState(372);
			parameterList();
			setState(373);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(TypeKeyword);
			setState(376);
			identifier();
			setState(377);
			match(T__21);
			setState(378);
			elementaryTypeName();
			setState(379);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public UsingForObjectContext usingForObject() {
			return getRuleContext(UsingForObjectContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode GlobalKeyword() { return getToken(SolidityParser.GlobalKeyword, 0); }
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_usingForDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__25);
			setState(382);
			usingForObject();
			setState(383);
			match(T__26);
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(384);
				match(T__2);
				}
				break;
			case T__13:
			case T__24:
			case T__37:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__94:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				{
				setState(385);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GlobalKeyword) {
				{
				setState(388);
				match(GlobalKeyword);
				}
			}

			setState(391);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForObjectContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public List<UsingForObjectDirectiveContext> usingForObjectDirective() {
			return getRuleContexts(UsingForObjectDirectiveContext.class);
		}
		public UsingForObjectDirectiveContext usingForObjectDirective(int i) {
			return getRuleContext(UsingForObjectDirectiveContext.class,i);
		}
		public UsingForObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForObject; }
	}

	public final UsingForObjectContext usingForObject() throws RecognitionException {
		UsingForObjectContext _localctx = new UsingForObjectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_usingForObject);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__24:
			case T__43:
			case T__49:
			case T__61:
			case T__94:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				userDefinedTypeName();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(T__14);
				setState(395);
				usingForObjectDirective();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(396);
					match(T__15);
					setState(397);
					usingForObjectDirective();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForObjectDirectiveContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public UserDefinableOperatorsContext userDefinableOperators() {
			return getRuleContext(UserDefinableOperatorsContext.class,0);
		}
		public UsingForObjectDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForObjectDirective; }
	}

	public final UsingForObjectDirectiveContext usingForObjectDirective() throws RecognitionException {
		UsingForObjectDirectiveContext _localctx = new UsingForObjectDirectiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_usingForObjectDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			userDefinedTypeName();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(408);
				match(T__11);
				setState(409);
				userDefinableOperators();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserDefinableOperatorsContext extends ParserRuleContext {
		public UserDefinableOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinableOperators; }
	}

	public final UserDefinableOperatorsContext userDefinableOperators() throws RecognitionException {
		UserDefinableOperatorsContext _localctx = new UserDefinableOperatorsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_userDefinableOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__35);
			setState(415);
			identifier();
			setState(416);
			match(T__14);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(417);
				variableDeclaration();
				setState(418);
				match(T__1);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					{
					setState(419);
					variableDeclaration();
					setState(420);
					match(T__1);
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(429);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__36);
			setState(432);
			identifier();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(433);
				parameterList();
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__95 || _la==VirtualKeyword) {
				{
				setState(438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VirtualKeyword:
					{
					setState(436);
					match(VirtualKeyword);
					}
					break;
				case T__95:
					{
					setState(437);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(443);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(444);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			identifier();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(448);
				match(T__22);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
					{
					setState(449);
					expressionList();
					}
				}

				setState(452);
				match(T__23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDescriptorContext functionDescriptor() {
			return getRuleContext(FunctionDescriptorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			functionDescriptor();
			setState(456);
			parameterList();
			setState(457);
			modifierList();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(458);
				returnParameters();
				}
			}

			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(461);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(462);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDescriptorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public TerminalNode FallbackKeyword() { return getToken(SolidityParser.FallbackKeyword, 0); }
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public FunctionDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDescriptor; }
	}

	public final FunctionDescriptorContext functionDescriptor() throws RecognitionException {
		FunctionDescriptorContext _localctx = new FunctionDescriptorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionDescriptor);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(T__37);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					setState(466);
					identifier();
					}
				}

				}
				break;
			case ConstructorKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(ConstructorKeyword);
				}
				break;
			case FallbackKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(FallbackKeyword);
				}
				break;
			case ReceiveKeyword:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(ReceiveKeyword);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__38);
			setState(475);
			parameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierListContext extends ParserRuleContext {
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (T__95 - 95)) | (1L << (ConstantKeyword - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (ExternalKeyword - 95)) | (1L << (InternalKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (PrivateKeyword - 95)) | (1L << (PublicKeyword - 95)) | (1L << (VirtualKeyword - 95)) | (1L << (PureKeyword - 95)) | (1L << (ViewKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(477);
					match(ExternalKeyword);
					}
					break;
				case 2:
					{
					setState(478);
					match(PublicKeyword);
					}
					break;
				case 3:
					{
					setState(479);
					match(InternalKeyword);
					}
					break;
				case 4:
					{
					setState(480);
					match(PrivateKeyword);
					}
					break;
				case 5:
					{
					setState(481);
					match(VirtualKeyword);
					}
					break;
				case 6:
					{
					setState(482);
					stateMutability();
					}
					break;
				case 7:
					{
					setState(483);
					modifierInvocation();
					}
					break;
				case 8:
					{
					setState(484);
					overrideSpecifier();
					}
					break;
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__39);
			setState(491);
			identifier();
			setState(492);
			eventParameterList();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(493);
				match(AnonymousKeyword);
				}
			}

			setState(496);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__40);
			setState(501);
			identifier();
			setState(502);
			match(T__14);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(503);
				enumValue();
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(506);
				match(T__15);
				setState(507);
				enumValue();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__22);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(516);
				parameter();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(517);
					match(T__15);
					setState(518);
					parameter();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(526);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			typeName(0);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(529);
				storageLocation();
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(532);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(T__22);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(536);
				eventParameter();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(537);
					match(T__15);
					setState(538);
					eventParameter();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(546);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			typeName(0);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(549);
				match(IndexedKeyword);
				}
			}

			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(552);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__22);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(556);
				functionTypeParameter();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(557);
					match(T__15);
					setState(558);
					functionTypeParameter();
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(566);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			typeName(0);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
				{
				setState(569);
				storageLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			typeName(0);
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(573);
				storageLocation();
				}
				break;
			}
			setState(576);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(579);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(580);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(581);
				mapping();
				}
				break;
			case 4:
				{
				setState(582);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(583);
				match(T__43);
				setState(584);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(587);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(588);
					match(T__41);
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
						{
						setState(589);
						expression(0);
						}
					}

					setState(592);
					match(T__42);
					}
					} 
				}
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			identifier();
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					match(T__44);
					setState(600);
					identifier();
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingKeyContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKey; }
	}

	public final MappingKeyContext mappingKey() throws RecognitionException {
		MappingKeyContext _localctx = new MappingKeyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mappingKey);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				elementaryTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				userDefinedTypeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public MappingKeyContext mappingKey() {
			return getRuleContext(MappingKeyContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingKeyNameContext mappingKeyName() {
			return getRuleContext(MappingKeyNameContext.class,0);
		}
		public MappingValueNameContext mappingValueName() {
			return getRuleContext(MappingValueNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(T__45);
			setState(611);
			match(T__22);
			setState(612);
			mappingKey();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(613);
				mappingKeyName();
				}
			}

			setState(616);
			match(T__46);
			setState(617);
			typeName(0);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(618);
				mappingValueName();
				}
			}

			setState(621);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingKeyNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MappingKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKeyName; }
	}

	public final MappingKeyNameContext mappingKeyName() throws RecognitionException {
		MappingKeyNameContext _localctx = new MappingKeyNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mappingKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingValueNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MappingValueNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingValueName; }
	}

	public final MappingValueNameContext mappingValueName() throws RecognitionException {
		MappingValueNameContext _localctx = new MappingValueNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mappingValueName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(T__37);
			setState(628);
			functionTypeParameterList();
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(632);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(629);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(630);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(631);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(637);
				match(T__38);
				setState(638);
				functionTypeParameterList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (ConstantKeyword - 110)) | (1L << (PayableKeyword - 110)) | (1L << (PureKeyword - 110)) | (1L << (ViewKeyword - 110)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__14);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__14 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__26 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__50 - 6)) | (1L << (T__52 - 6)) | (1L << (T__54 - 6)) | (1L << (T__55 - 6)) | (1L << (T__56 - 6)) | (1L << (T__57 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__60 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (BreakKeyword - 71)) | (1L << (ContinueKeyword - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
				{
				{
				setState(646);
				statement();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(652);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public UncheckedStatementContext uncheckedStatement() {
			return getRuleContext(UncheckedStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				tryStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(658);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(659);
				inlineAssemblyStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(660);
				doWhileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(661);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(662);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(663);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(664);
				throwStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(665);
				emitStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(666);
				simpleStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(667);
				uncheckedStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(668);
				revertStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			expression(0);
			setState(672);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(T__50);
			setState(675);
			match(T__22);
			setState(676);
			expression(0);
			setState(677);
			match(T__23);
			setState(678);
			statement();
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(679);
				match(T__51);
				setState(680);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(T__52);
			setState(684);
			expression(0);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(685);
				returnParameters();
				}
			}

			setState(688);
			block();
			setState(690); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(689);
				catchClause();
				}
				}
				setState(692); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__53 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(T__53);
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__22) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					setState(695);
					identifier();
					}
				}

				setState(698);
				parameterList();
				}
			}

			setState(701);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__54);
			setState(704);
			match(T__22);
			setState(705);
			expression(0);
			setState(706);
			match(T__23);
			setState(707);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(709);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(710);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UncheckedStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedStatement; }
	}

	public final UncheckedStatementContext uncheckedStatement() throws RecognitionException {
		UncheckedStatementContext _localctx = new UncheckedStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_uncheckedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(T__55);
			setState(714);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(T__26);
			setState(717);
			match(T__22);
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__22:
			case T__24:
			case T__29:
			case T__30:
			case T__37:
			case T__41:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__70:
			case T__71:
			case T__94:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(718);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(719);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__22:
			case T__24:
			case T__29:
			case T__30:
			case T__37:
			case T__41:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__70:
			case T__71:
			case T__94:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(722);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(723);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
				{
				setState(726);
				expression(0);
				}
			}

			setState(729);
			match(T__23);
			setState(730);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public InlineAssemblyStatementFlagContext inlineAssemblyStatementFlag() {
			return getRuleContext(InlineAssemblyStatementFlagContext.class,0);
		}
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__56);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteralFragment) {
				{
				setState(733);
				match(StringLiteralFragment);
				}
			}

			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(736);
				match(T__22);
				setState(737);
				inlineAssemblyStatementFlag();
				setState(738);
				match(T__23);
				}
			}

			setState(742);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineAssemblyStatementFlagContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public InlineAssemblyStatementFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatementFlag; }
	}

	public final InlineAssemblyStatementFlagContext inlineAssemblyStatementFlag() throws RecognitionException {
		InlineAssemblyStatementFlagContext _localctx = new InlineAssemblyStatementFlagContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineAssemblyStatementFlag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(T__57);
			setState(747);
			statement();
			setState(748);
			match(T__54);
			setState(749);
			match(T__22);
			setState(750);
			expression(0);
			setState(751);
			match(T__23);
			setState(752);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(ContinueKeyword);
			setState(755);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(BreakKeyword);
			setState(758);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(T__58);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
				{
				setState(761);
				expression(0);
				}
			}

			setState(764);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(T__59);
			setState(767);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(T__60);
			setState(770);
			functionCall();
			setState(771);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevertStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(T__61);
			setState(774);
			functionCall();
			setState(775);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(777);
				match(T__62);
				setState(778);
				identifierList();
				}
				break;
			case 2:
				{
				setState(779);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(780);
				match(T__22);
				setState(781);
				variableDeclarationList();
				setState(782);
				match(T__23);
				}
				break;
			}
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(786);
				match(T__10);
				setState(787);
				expression(0);
				}
			}

			setState(790);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(792);
				variableDeclaration();
				}
			}

			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(795);
				match(T__15);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__45 - 14)) | (1L << (T__49 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					setState(796);
					variableDeclaration();
					}
				}

				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(T__22);
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(806);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
						{
						setState(805);
						identifier();
						}
					}

					setState(808);
					match(T__15);
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(814);
				identifier();
				}
			}

			setState(817);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (T__43 - 44)) | (1L << (T__62 - 44)) | (1L << (T__63 - 44)) | (1L << (T__64 - 44)) | (1L << (T__65 - 44)) | (1L << (Int - 44)) | (1L << (Uint - 44)) | (1L << (Byte - 44)) | (1L << (Fixed - 44)) | (1L << (Ufixed - 44)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(822);
				match(T__68);
				setState(823);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(824);
				match(T__22);
				setState(825);
				expression(0);
				setState(826);
				match(T__23);
				}
				break;
			case 3:
				{
				setState(828);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(829);
				expression(19);
				}
				break;
			case 4:
				{
				setState(830);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(831);
				expression(18);
				}
				break;
			case 5:
				{
				setState(832);
				match(T__70);
				setState(833);
				expression(17);
				}
				break;
			case 6:
				{
				setState(834);
				match(T__71);
				setState(835);
				expression(16);
				}
				break;
			case 7:
				{
				setState(836);
				match(T__5);
				setState(837);
				expression(15);
				}
				break;
			case 8:
				{
				setState(838);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(913);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(841);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(842);
						match(T__72);
						setState(843);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(844);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(845);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__31) | (1L << T__32))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(846);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(847);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(848);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(849);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(850);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(851);
						_la = _input.LA(1);
						if ( !(_la==T__73 || _la==T__74) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(852);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(853);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(854);
						match(T__28);
						setState(855);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(856);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(857);
						match(T__4);
						setState(858);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(859);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(860);
						match(T__27);
						setState(861);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(862);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(863);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(864);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(865);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(866);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(867);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(868);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(869);
						match(T__75);
						setState(870);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(871);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(872);
						match(T__3);
						setState(873);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(874);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(875);
						match(T__76);
						setState(876);
						expression(0);
						setState(877);
						match(T__69);
						setState(878);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(880);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(881);
						_la = _input.LA(1);
						if ( !(_la==T__10 || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (T__80 - 78)) | (1L << (T__81 - 78)) | (1L << (T__82 - 78)) | (1L << (T__83 - 78)) | (1L << (T__84 - 78)) | (1L << (T__85 - 78)) | (1L << (T__86 - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(882);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(883);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(884);
						_la = _input.LA(1);
						if ( !(_la==T__66 || _la==T__67) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(885);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(886);
						match(T__41);
						setState(887);
						expression(0);
						setState(888);
						match(T__42);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(890);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(891);
						match(T__41);
						setState(893);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
							{
							setState(892);
							expression(0);
							}
						}

						setState(895);
						match(T__69);
						setState(897);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
							{
							setState(896);
							expression(0);
							}
						}

						setState(899);
						match(T__42);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(900);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(901);
						match(T__44);
						setState(902);
						identifier();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(904);
						match(T__14);
						setState(905);
						nameValueList();
						setState(906);
						match(T__16);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(908);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(909);
						match(T__22);
						setState(910);
						functionCallArguments();
						setState(911);
						match(T__23);
						}
						break;
					}
					} 
				}
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_primaryExpression);
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				hexLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(921);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(922);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(923);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(924);
				match(PayableKeyword);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(925);
				tupleExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(926);
				typeName(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			expression(0);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(930);
				match(T__15);
				setState(931);
				expression(0);
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			nameValue();
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(938);
					match(T__15);
					setState(939);
					nameValue();
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(945);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			identifier();
			setState(949);
			match(T__69);
			setState(950);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionCallArguments);
		int _la;
		try {
			setState(960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				match(T__14);
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					setState(953);
					nameValueList();
					}
				}

				setState(956);
				match(T__16);
				}
				break;
			case T__5:
			case T__13:
			case T__22:
			case T__23:
			case T__24:
			case T__29:
			case T__30:
			case T__37:
			case T__41:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__70:
			case T__71:
			case T__94:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
					{
					setState(957);
					expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			expression(0);
			setState(963);
			match(T__22);
			setState(964);
			functionCallArguments();
			setState(965);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(T__14);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__22 - 14)) | (1L << (T__24 - 14)) | (1L << (T__26 - 14)) | (1L << (T__37 - 14)) | (1L << (T__43 - 14)) | (1L << (T__49 - 14)) | (1L << (T__50 - 14)) | (1L << (T__58 - 14)) | (1L << (T__61 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__87 - 88)) | (1L << (T__90 - 88)) | (1L << (T__94 - 88)) | (1L << (BooleanLiteral - 88)) | (1L << (DecimalNumber - 88)) | (1L << (HexNumber - 88)) | (1L << (HexLiteralFragment - 88)) | (1L << (BreakKeyword - 88)) | (1L << (ContinueKeyword - 88)) | (1L << (LeaveKeyword - 88)) | (1L << (PayableKeyword - 88)) | (1L << (GlobalKeyword - 88)) | (1L << (ConstructorKeyword - 88)) | (1L << (ReceiveKeyword - 88)) | (1L << (Identifier - 88)) | (1L << (StringLiteralFragment - 88)))) != 0)) {
				{
				{
				setState(968);
				assemblyItem();
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(974);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyItem);
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(979);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(980);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(981);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(982);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(983);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(984);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(985);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(986);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(987);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(988);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(989);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(990);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(991);
				stringLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(992);
				hexLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyMemberContext assemblyMember() {
			return getRuleContext(AssemblyMemberContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyExpression);
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				assemblyCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				assemblyLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				assemblyMember();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyMemberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyMember; }
	}

	public final AssemblyMemberContext assemblyMember() throws RecognitionException {
		AssemblyMemberContext _localctx = new AssemblyMemberContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			identifier();
			setState(1001);
			match(T__44);
			setState(1002);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1004);
				match(T__58);
				}
				break;
			case 2:
				{
				setState(1005);
				match(T__43);
				}
				break;
			case 3:
				{
				setState(1006);
				match(T__65);
				}
				break;
			case 4:
				{
				setState(1007);
				identifier();
				}
				break;
			}
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1010);
				match(T__22);
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__24 - 14)) | (1L << (T__43 - 14)) | (1L << (T__49 - 14)) | (1L << (T__58 - 14)) | (1L << (T__61 - 14)) | (1L << (T__65 - 14)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteralFragment - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteralFragment - 95)))) != 0)) {
					{
					setState(1011);
					assemblyExpression();
					}
				}

				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1014);
					match(T__15);
					setState(1015);
					assemblyExpression();
					}
					}
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1021);
				match(T__23);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(T__87);
			setState(1025);
			assemblyIdentifierOrList();
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(1026);
				match(T__88);
				setState(1027);
				assemblyExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			assemblyIdentifierOrList();
			setState(1031);
			match(T__88);
			setState(1032);
			assemblyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyMemberContext assemblyMember() {
			return getRuleContext(AssemblyMemberContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_assemblyIdentifierOrList);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				assemblyMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1036);
				assemblyIdentifierList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1037);
				match(T__22);
				setState(1038);
				assemblyIdentifierList();
				setState(1039);
				match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			identifier();
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1044);
				match(T__15);
				setState(1045);
				identifier();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			assemblyExpression();
			setState(1052);
			match(T__89);
			setState(1053);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			identifier();
			setState(1056);
			match(T__69);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(T__90);
			setState(1059);
			assemblyExpression();
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__91 || _la==T__92) {
				{
				{
				setState(1060);
				assemblyCase();
				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_assemblyCase);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				match(T__91);
				setState(1067);
				assemblyLiteral();
				setState(1068);
				assemblyBlock();
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(T__92);
				setState(1071);
				assemblyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(T__37);
			setState(1075);
			identifier();
			setState(1076);
			match(T__22);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(1077);
				assemblyIdentifierList();
				}
			}

			setState(1080);
			match(T__23);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__93) {
				{
				setState(1081);
				assemblyFunctionReturns();
				}
			}

			setState(1084);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1086);
			match(T__93);
			setState(1087);
			assemblyIdentifierList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(T__26);
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1090);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__24:
			case T__43:
			case T__49:
			case T__58:
			case T__61:
			case T__65:
			case T__94:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(1091);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1094);
			assemblyExpression();
			setState(1097);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1095);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__24:
			case T__43:
			case T__49:
			case T__58:
			case T__61:
			case T__65:
			case T__94:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(1096);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1099);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(T__50);
			setState(1102);
			assemblyExpression();
			setState(1103);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_assemblyLiteral);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				stringLiteral();
				}
				break;
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(DecimalNumber);
				}
				break;
			case HexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				match(HexNumber);
				}
				break;
			case HexLiteralFragment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1108);
				hexLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1109);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tupleExpression);
		int _la;
		try {
			setState(1138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				match(T__22);
				{
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
					{
					setState(1113);
					expression(0);
					}
				}

				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1116);
					match(T__15);
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
						{
						setState(1117);
						expression(0);
						}
					}

					}
					}
					setState(1124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1125);
				match(T__23);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				match(T__41);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__13 - 6)) | (1L << (T__22 - 6)) | (1L << (T__24 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__37 - 6)) | (1L << (T__41 - 6)) | (1L << (T__43 - 6)) | (1L << (T__45 - 6)) | (1L << (T__49 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__94 - 71)) | (1L << (Int - 71)) | (1L << (Uint - 71)) | (1L << (Byte - 71)) | (1L << (Fixed - 71)) | (1L << (Ufixed - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (DecimalNumber - 71)) | (1L << (HexNumber - 71)) | (1L << (HexLiteralFragment - 71)) | (1L << (LeaveKeyword - 71)) | (1L << (PayableKeyword - 71)) | (1L << (TypeKeyword - 71)) | (1L << (GlobalKeyword - 71)) | (1L << (ConstructorKeyword - 71)) | (1L << (ReceiveKeyword - 71)) | (1L << (Identifier - 71)) | (1L << (StringLiteralFragment - 71)))) != 0)) {
					{
					setState(1127);
					expression(0);
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(1128);
						match(T__15);
						setState(1129);
						expression(0);
						}
						}
						setState(1134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1137);
				match(T__42);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1141);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public TerminalNode GlobalKeyword() { return getToken(SolidityParser.GlobalKeyword, 0); }
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__43) | (1L << T__49) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (LeaveKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (GlobalKeyword - 95)) | (1L << (ConstructorKeyword - 95)) | (1L << (ReceiveKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexLiteralFragment() { return getTokens(SolidityParser.HexLiteralFragment); }
		public TerminalNode HexLiteralFragment(int i) {
			return getToken(SolidityParser.HexLiteralFragment, i);
		}
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_hexLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1146);
					match(HexLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public List<UserDefinedTypeNameContext> userDefinedTypeName() {
			return getRuleContexts(UserDefinedTypeNameContext.class);
		}
		public UserDefinedTypeNameContext userDefinedTypeName(int i) {
			return getRuleContext(UserDefinedTypeNameContext.class,i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(T__95);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(1152);
				match(T__22);
				setState(1153);
				userDefinedTypeName();
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1154);
					match(T__15);
					setState(1155);
					userDefinedTypeName();
					}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1161);
				match(T__23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteralFragment() { return getTokens(SolidityParser.StringLiteralFragment); }
		public TerminalNode StringLiteralFragment(int i) {
			return getToken(SolidityParser.StringLiteralFragment, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_stringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1166); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1165);
					match(StringLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1168); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 70:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 27);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		case 17:
			return precpred(_ctx, 23);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0088\u0495\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2\u00d8\n\2\f\2\16\2\u00db\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5\u00e9\n\5\3\6\3\6\5\6\u00ed\n\6\3\6\7\6"+
		"\u00f0\n\6\f\6\16\6\u00f3\13\6\3\7\3\7\3\b\5\b\u00f8\n\b\3\b\3\b\5\b\u00fc"+
		"\n\b\3\b\5\b\u00ff\n\b\3\t\3\t\3\t\5\t\u0104\n\t\3\n\3\n\3\n\3\n\5\n\u010a"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0111\n\n\3\n\3\n\5\n\u0115\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0120\n\n\f\n\16\n\u0123\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u012a\n\n\3\13\3\13\3\f\5\f\u012f\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0137\n\f\f\f\16\f\u013a\13\f\5\f\u013c\n\f\3\f\3\f\7\f\u0140"+
		"\n\f\f\f\16\f\u0143\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u014a\n\r\3\r\5\r\u014d"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0158\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0162\n\17\f\17\16\17\u0165\13"+
		"\17\3\17\3\17\3\17\5\17\u016a\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0185\n\23\3\23\5\23\u0188\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u0191\n\24\f\24\16\24\u0194\13\24\3\24\3"+
		"\24\5\24\u0198\n\24\3\25\3\25\3\25\5\25\u019d\n\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01a9\n\27\f\27\16\27\u01ac\13\27"+
		"\5\27\u01ae\n\27\3\27\3\27\3\30\3\30\3\30\5\30\u01b5\n\30\3\30\3\30\7"+
		"\30\u01b9\n\30\f\30\16\30\u01bc\13\30\3\30\3\30\5\30\u01c0\n\30\3\31\3"+
		"\31\3\31\5\31\u01c5\n\31\3\31\5\31\u01c8\n\31\3\32\3\32\3\32\3\32\5\32"+
		"\u01ce\n\32\3\32\3\32\5\32\u01d2\n\32\3\33\3\33\5\33\u01d6\n\33\3\33\3"+
		"\33\3\33\5\33\u01db\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u01e8\n\35\f\35\16\35\u01eb\13\35\3\36\3\36\3\36\3\36"+
		"\5\36\u01f1\n\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u01fb\n \3 \3 \7 "+
		"\u01ff\n \f \16 \u0202\13 \3 \3 \3!\3!\3!\3!\7!\u020a\n!\f!\16!\u020d"+
		"\13!\5!\u020f\n!\3!\3!\3\"\3\"\5\"\u0215\n\"\3\"\5\"\u0218\n\"\3#\3#\3"+
		"#\3#\7#\u021e\n#\f#\16#\u0221\13#\5#\u0223\n#\3#\3#\3$\3$\5$\u0229\n$"+
		"\3$\5$\u022c\n$\3%\3%\3%\3%\7%\u0232\n%\f%\16%\u0235\13%\5%\u0237\n%\3"+
		"%\3%\3&\3&\5&\u023d\n&\3\'\3\'\5\'\u0241\n\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u024c\n(\3(\3(\3(\5(\u0251\n(\3(\7(\u0254\n(\f(\16(\u0257\13("+
		"\3)\3)\3)\7)\u025c\n)\f)\16)\u025f\13)\3*\3*\5*\u0263\n*\3+\3+\3+\3+\5"+
		"+\u0269\n+\3+\3+\3+\5+\u026e\n+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\7.\u027b"+
		"\n.\f.\16.\u027e\13.\3.\3.\5.\u0282\n.\3/\3/\3\60\3\60\3\61\3\61\7\61"+
		"\u028a\n\61\f\61\16\61\u028d\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02a0\n\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02ac\n\64\3\65\3\65"+
		"\3\65\5\65\u02b1\n\65\3\65\3\65\6\65\u02b5\n\65\r\65\16\65\u02b6\3\66"+
		"\3\66\5\66\u02bb\n\66\3\66\5\66\u02be\n\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\38\38\58\u02ca\n8\39\39\39\3:\3:\3:\3:\5:\u02d3\n:\3:\3"+
		":\5:\u02d7\n:\3:\5:\u02da\n:\3:\3:\3:\3;\3;\5;\u02e1\n;\3;\3;\3;\3;\5"+
		";\u02e7\n;\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3"+
		"@\5@\u02fd\n@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3D\3"+
		"D\3D\5D\u0313\nD\3D\3D\5D\u0317\nD\3D\3D\3E\5E\u031c\nE\3E\3E\5E\u0320"+
		"\nE\7E\u0322\nE\fE\16E\u0325\13E\3F\3F\5F\u0329\nF\3F\7F\u032c\nF\fF\16"+
		"F\u032f\13F\3F\5F\u0332\nF\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\5H\u034a\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0380\nH\3H\3"+
		"H\5H\u0384\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u0394\nH\f"+
		"H\16H\u0397\13H\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03a2\nI\3J\3J\3J\7J\u03a7"+
		"\nJ\fJ\16J\u03aa\13J\3K\3K\3K\7K\u03af\nK\fK\16K\u03b2\13K\3K\5K\u03b5"+
		"\nK\3L\3L\3L\3L\3M\3M\5M\u03bd\nM\3M\3M\5M\u03c1\nM\5M\u03c3\nM\3N\3N"+
		"\3N\3N\3N\3O\3O\7O\u03cc\nO\fO\16O\u03cf\13O\3O\3O\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u03e4\nP\3Q\3Q\3Q\5Q\u03e9\nQ\3R\3"+
		"R\3R\3R\3S\3S\3S\3S\5S\u03f3\nS\3S\3S\5S\u03f7\nS\3S\3S\7S\u03fb\nS\f"+
		"S\16S\u03fe\13S\3S\5S\u0401\nS\3T\3T\3T\3T\5T\u0407\nT\3U\3U\3U\3U\3V"+
		"\3V\3V\3V\3V\3V\3V\5V\u0414\nV\3W\3W\3W\7W\u0419\nW\fW\16W\u041c\13W\3"+
		"X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\7Z\u0428\nZ\fZ\16Z\u042b\13Z\3[\3[\3[\3["+
		"\3[\3[\5[\u0433\n[\3\\\3\\\3\\\3\\\5\\\u0439\n\\\3\\\3\\\5\\\u043d\n\\"+
		"\3\\\3\\\3]\3]\3]\3^\3^\3^\5^\u0447\n^\3^\3^\3^\5^\u044c\n^\3^\3^\3_\3"+
		"_\3_\3_\3`\3`\3`\3`\3`\5`\u0459\n`\3a\3a\5a\u045d\na\3a\3a\5a\u0461\n"+
		"a\7a\u0463\na\fa\16a\u0466\13a\3a\3a\3a\3a\3a\7a\u046d\na\fa\16a\u0470"+
		"\13a\5a\u0472\na\3a\5a\u0475\na\3b\3b\5b\u0479\nb\3c\3c\3d\6d\u047e\n"+
		"d\rd\16d\u047f\3e\3e\3e\3e\3e\7e\u0487\ne\fe\16e\u048a\13e\3e\3e\5e\u048e"+
		"\ne\3f\6f\u0491\nf\rf\16f\u0492\3f\2\4N\u008eg\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\2\21\3\2\7\r\3\2\25\27\5\2\5\5\7\f\36%\3\2\62\64\6"+
		"\2ppxx||~~\5\2..ADcg\3\2EF\3\2 !\4\2\5\5\"#\3\2LM\3\2\t\f\3\2$%\4\2\r"+
		"\rPY\3\2ij\f\2\20\20\33\33..\64\64@@aattxx\177\u0080\u0082\u0083\2\u0517"+
		"\2\u00d9\3\2\2\2\4\u00de\3\2\2\2\6\u00e3\3\2\2\2\b\u00e8\3\2\2\2\n\u00ea"+
		"\3\2\2\2\f\u00f4\3\2\2\2\16\u00fe\3\2\2\2\20\u0100\3\2\2\2\22\u0129\3"+
		"\2\2\2\24\u012b\3\2\2\2\26\u012e\3\2\2\2\30\u0146\3\2\2\2\32\u0157\3\2"+
		"\2\2\34\u0159\3\2\2\2\36\u016d\3\2\2\2 \u0174\3\2\2\2\"\u0179\3\2\2\2"+
		"$\u017f\3\2\2\2&\u0197\3\2\2\2(\u0199\3\2\2\2*\u019e\3\2\2\2,\u01a0\3"+
		"\2\2\2.\u01b1\3\2\2\2\60\u01c1\3\2\2\2\62\u01c9\3\2\2\2\64\u01da\3\2\2"+
		"\2\66\u01dc\3\2\2\28\u01e9\3\2\2\2:\u01ec\3\2\2\2<\u01f4\3\2\2\2>\u01f6"+
		"\3\2\2\2@\u0205\3\2\2\2B\u0212\3\2\2\2D\u0219\3\2\2\2F\u0226\3\2\2\2H"+
		"\u022d\3\2\2\2J\u023a\3\2\2\2L\u023e\3\2\2\2N\u024b\3\2\2\2P\u0258\3\2"+
		"\2\2R\u0262\3\2\2\2T\u0264\3\2\2\2V\u0271\3\2\2\2X\u0273\3\2\2\2Z\u0275"+
		"\3\2\2\2\\\u0283\3\2\2\2^\u0285\3\2\2\2`\u0287\3\2\2\2b\u029f\3\2\2\2"+
		"d\u02a1\3\2\2\2f\u02a4\3\2\2\2h\u02ad\3\2\2\2j\u02b8\3\2\2\2l\u02c1\3"+
		"\2\2\2n\u02c9\3\2\2\2p\u02cb\3\2\2\2r\u02ce\3\2\2\2t\u02de\3\2\2\2v\u02ea"+
		"\3\2\2\2x\u02ec\3\2\2\2z\u02f4\3\2\2\2|\u02f7\3\2\2\2~\u02fa\3\2\2\2\u0080"+
		"\u0300\3\2\2\2\u0082\u0303\3\2\2\2\u0084\u0307\3\2\2\2\u0086\u0312\3\2"+
		"\2\2\u0088\u031b\3\2\2\2\u008a\u0326\3\2\2\2\u008c\u0335\3\2\2\2\u008e"+
		"\u0349\3\2\2\2\u0090\u03a1\3\2\2\2\u0092\u03a3\3\2\2\2\u0094\u03ab\3\2"+
		"\2\2\u0096\u03b6\3\2\2\2\u0098\u03c2\3\2\2\2\u009a\u03c4\3\2\2\2\u009c"+
		"\u03c9\3\2\2\2\u009e\u03e3\3\2\2\2\u00a0\u03e8\3\2\2\2\u00a2\u03ea\3\2"+
		"\2\2\u00a4\u03f2\3\2\2\2\u00a6\u0402\3\2\2\2\u00a8\u0408\3\2\2\2\u00aa"+
		"\u0413\3\2\2\2\u00ac\u0415\3\2\2\2\u00ae\u041d\3\2\2\2\u00b0\u0421\3\2"+
		"\2\2\u00b2\u0424\3\2\2\2\u00b4\u0432\3\2\2\2\u00b6\u0434\3\2\2\2\u00b8"+
		"\u0440\3\2\2\2\u00ba\u0443\3\2\2\2\u00bc\u044f\3\2\2\2\u00be\u0458\3\2"+
		"\2\2\u00c0\u0474\3\2\2\2\u00c2\u0476\3\2\2\2\u00c4\u047a\3\2\2\2\u00c6"+
		"\u047d\3\2\2\2\u00c8\u0481\3\2\2\2\u00ca\u0490\3\2\2\2\u00cc\u00d8\5\4"+
		"\3\2\u00cd\u00d8\5\22\n\2\u00ce\u00d8\5\26\f\2\u00cf\u00d8\5> \2\u00d0"+
		"\u00d8\5:\36\2\u00d1\u00d8\5,\27\2\u00d2\u00d8\5\62\32\2\u00d3\u00d8\5"+
		"\36\20\2\u00d4\u00d8\5 \21\2\u00d5\u00d8\5\"\22\2\u00d6\u00d8\5$\23\2"+
		"\u00d7\u00cc\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00cf"+
		"\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\2\2\3\u00dd\3\3\2\2\2"+
		"\u00de\u00df\7\3\2\2\u00df\u00e0\5\6\4\2\u00e0\u00e1\5\b\5\2\u00e1\u00e2"+
		"\7\4\2\2\u00e2\5\3\2\2\2\u00e3\u00e4\5\u00c4c\2\u00e4\7\3\2\2\2\u00e5"+
		"\u00e9\7\5\2\2\u00e6\u00e9\5\n\6\2\u00e7\u00e9\5\u008eH\2\u00e8\u00e5"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\t\3\2\2\2\u00ea"+
		"\u00f1\5\16\b\2\u00eb\u00ed\7\6\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\5\16\b\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\13\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\t\2\2\2\u00f5\r\3\2\2\2\u00f6\u00f8"+
		"\5\f\7\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00ff\7\u0085\2\2\u00fa\u00fc\5\f\7\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7i\2\2\u00fe\u00f7\3\2\2\2\u00fe"+
		"\u00fb\3\2\2\2\u00ff\17\3\2\2\2\u0100\u0103\5\u00c4c\2\u0101\u0102\7\16"+
		"\2\2\u0102\u0104\5\u00c4c\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\21\3\2\2\2\u0105\u0106\7\17\2\2\u0106\u0109\5\24\13\2\u0107\u0108\7\16"+
		"\2\2\u0108\u010a\5\u00c4c\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\7\4\2\2\u010c\u012a\3\2\2\2\u010d\u0110\7\17"+
		"\2\2\u010e\u0111\7\5\2\2\u010f\u0111\5\u00c4c\2\u0110\u010e\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0113\7\16\2\2\u0113\u0115\5"+
		"\u00c4c\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116\u0117\7\20\2\2\u0117\u0118\5\24\13\2\u0118\u0119\7\4\2\2\u0119"+
		"\u012a\3\2\2\2\u011a\u011b\7\17\2\2\u011b\u011c\7\21\2\2\u011c\u0121\5"+
		"\20\t\2\u011d\u011e\7\22\2\2\u011e\u0120\5\20\t\2\u011f\u011d\3\2\2\2"+
		"\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\23\2\2\u0125\u0126\7\20\2\2"+
		"\u0126\u0127\5\24\13\2\u0127\u0128\7\4\2\2\u0128\u012a\3\2\2\2\u0129\u0105"+
		"\3\2\2\2\u0129\u010d\3\2\2\2\u0129\u011a\3\2\2\2\u012a\23\3\2\2\2\u012b"+
		"\u012c\7\u0084\2\2\u012c\25\3\2\2\2\u012d\u012f\7\24\2\2\u012e\u012d\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\t\3\2\2\u0131"+
		"\u013b\5\u00c4c\2\u0132\u0133\7\30\2\2\u0133\u0138\5\30\r\2\u0134\u0135"+
		"\7\22\2\2\u0135\u0137\5\30\r\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0141\7\21\2\2\u013e\u0140\5\32\16\2\u013f\u013e\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0145\7\23\2\2\u0145\27\3\2\2\2\u0146\u014c\5P)\2"+
		"\u0147\u0149\7\31\2\2\u0148\u014a\5\u0092J\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\7\32\2\2\u014c\u0147\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\31\3\2\2\2\u014e\u0158\5\34\17\2\u014f"+
		"\u0158\5$\23\2\u0150\u0158\5,\27\2\u0151\u0158\5.\30\2\u0152\u0158\5\62"+
		"\32\2\u0153\u0158\5:\36\2\u0154\u0158\5> \2\u0155\u0158\5 \21\2\u0156"+
		"\u0158\5\"\22\2\u0157\u014e\3\2\2\2\u0157\u014f\3\2\2\2\u0157\u0150\3"+
		"\2\2\2\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0157"+
		"\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\33\3\2\2"+
		"\2\u0159\u0163\5N(\2\u015a\u0162\7z\2\2\u015b\u0162\7w\2\2\u015c\u0162"+
		"\7y\2\2\u015d\u0162\7p\2\2\u015e\u0162\7q\2\2\u015f\u0162\7r\2\2\u0160"+
		"\u0162\5\u00c8e\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c"+
		"\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0169\5\u00c4c\2\u0167"+
		"\u0168\7\r\2\2\u0168\u016a\5\u008eH\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\4\2\2\u016c\35\3\2\2\2\u016d"+
		"\u016e\5N(\2\u016e\u016f\7p\2\2\u016f\u0170\5\u00c4c\2\u0170\u0171\7\r"+
		"\2\2\u0171\u0172\5\u008eH\2\u0172\u0173\7\4\2\2\u0173\37\3\2\2\2\u0174"+
		"\u0175\7\33\2\2\u0175\u0176\5\u00c4c\2\u0176\u0177\5@!\2\u0177\u0178\7"+
		"\4\2\2\u0178!\3\2\2\2\u0179\u017a\7}\2\2\u017a\u017b\5\u00c4c\2\u017b"+
		"\u017c\7\30\2\2\u017c\u017d\5\u008cG\2\u017d\u017e\7\4\2\2\u017e#\3\2"+
		"\2\2\u017f\u0180\7\34\2\2\u0180\u0181\5&\24\2\u0181\u0184\7\35\2\2\u0182"+
		"\u0185\7\5\2\2\u0183\u0185\5N(\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2"+
		"\2\u0185\u0187\3\2\2\2\u0186\u0188\7\177\2\2\u0187\u0186\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\7\4\2\2\u018a%\3\2\2\2"+
		"\u018b\u0198\5P)\2\u018c\u018d\7\21\2\2\u018d\u0192\5(\25\2\u018e\u018f"+
		"\7\22\2\2\u018f\u0191\5(\25\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2"+
		"\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0195\u0196\7\23\2\2\u0196\u0198\3\2\2\2\u0197\u018b\3\2\2\2"+
		"\u0197\u018c\3\2\2\2\u0198\'\3\2\2\2\u0199\u019c\5P)\2\u019a\u019b\7\16"+
		"\2\2\u019b\u019d\5*\26\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		")\3\2\2\2\u019e\u019f\t\4\2\2\u019f+\3\2\2\2\u01a0\u01a1\7&\2\2\u01a1"+
		"\u01a2\5\u00c4c\2\u01a2\u01ad\7\21\2\2\u01a3\u01a4\5L\'\2\u01a4\u01aa"+
		"\7\4\2\2\u01a5\u01a6\5L\'\2\u01a6\u01a7\7\4\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a5\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01a3\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7\23\2\2\u01b0-\3\2\2\2"+
		"\u01b1\u01b2\7\'\2\2\u01b2\u01b4\5\u00c4c\2\u01b3\u01b5\5@!\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01ba\3\2\2\2\u01b6\u01b9\7{\2\2\u01b7"+
		"\u01b9\5\u00c8e\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bf\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01c0\7\4\2\2\u01be\u01c0\5`\61\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01be\3\2\2\2\u01c0/\3\2\2\2\u01c1\u01c7\5\u00c4c\2\u01c2\u01c4"+
		"\7\31\2\2\u01c3\u01c5\5\u0092J\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\7\32\2\2\u01c7\u01c2\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\61\3\2\2\2\u01c9\u01ca\5\64\33\2\u01ca\u01cb\5@!"+
		"\2\u01cb\u01cd\58\35\2\u01cc\u01ce\5\66\34\2\u01cd\u01cc\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01d2\7\4\2\2\u01d0\u01d2\5`"+
		"\61\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\63\3\2\2\2\u01d3\u01d5"+
		"\7(\2\2\u01d4\u01d6\5\u00c4c\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2"+
		"\u01d6\u01db\3\2\2\2\u01d7\u01db\7\u0080\2\2\u01d8\u01db\7\u0081\2\2\u01d9"+
		"\u01db\7\u0082\2\2\u01da\u01d3\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8"+
		"\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\65\3\2\2\2\u01dc\u01dd\7)\2\2\u01dd"+
		"\u01de\5@!\2\u01de\67\3\2\2\2\u01df\u01e8\7u\2\2\u01e0\u01e8\7z\2\2\u01e1"+
		"\u01e8\7w\2\2\u01e2\u01e8\7y\2\2\u01e3\u01e8\7{\2\2\u01e4\u01e8\5^\60"+
		"\2\u01e5\u01e8\5\60\31\2\u01e6\u01e8\5\u00c8e\2\u01e7\u01df\3\2\2\2\u01e7"+
		"\u01e0\3\2\2\2\u01e7\u01e1\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e7\u01e3\3\2"+
		"\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea9\3\2\2\2"+
		"\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7*\2\2\u01ed\u01ee\5\u00c4c\2\u01ee\u01f0"+
		"\5D#\2\u01ef\u01f1\7n\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\7\4\2\2\u01f3;\3\2\2\2\u01f4\u01f5\5\u00c4"+
		"c\2\u01f5=\3\2\2\2\u01f6\u01f7\7+\2\2\u01f7\u01f8\5\u00c4c\2\u01f8\u01fa"+
		"\7\21\2\2\u01f9\u01fb\5<\37\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2"+
		"\u01fb\u0200\3\2\2\2\u01fc\u01fd\7\22\2\2\u01fd\u01ff\5<\37\2\u01fe\u01fc"+
		"\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\23\2\2\u0204?\3\2\2\2"+
		"\u0205\u020e\7\31\2\2\u0206\u020b\5B\"\2\u0207\u0208\7\22\2\2\u0208\u020a"+
		"\5B\"\2\u0209\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0206\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7\32\2\2\u0211"+
		"A\3\2\2\2\u0212\u0214\5N(\2\u0213\u0215\5\\/\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\5\u00c4c\2\u0217\u0216"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218C\3\2\2\2\u0219\u0222\7\31\2\2\u021a"+
		"\u021f\5F$\2\u021b\u021c\7\22\2\2\u021c\u021e\5F$\2\u021d\u021b\3\2\2"+
		"\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223"+
		"\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u021a\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\7\32\2\2\u0225E\3\2\2\2\u0226\u0228\5N(\2\u0227"+
		"\u0229\7v\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u022c\5\u00c4c\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"G\3\2\2\2\u022d\u0236\7\31\2\2\u022e\u0233\5J&\2\u022f\u0230\7\22\2\2"+
		"\u0230\u0232\5J&\2\u0231\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0236"+
		"\u022e\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\7\32"+
		"\2\2\u0239I\3\2\2\2\u023a\u023c\5N(\2\u023b\u023d\5\\/\2\u023c\u023b\3"+
		"\2\2\2\u023c\u023d\3\2\2\2\u023dK\3\2\2\2\u023e\u0240\5N(\2\u023f\u0241"+
		"\5\\/\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\5\u00c4c\2\u0243M\3\2\2\2\u0244\u0245\b(\1\2\u0245\u024c\5\u008c"+
		"G\2\u0246\u024c\5P)\2\u0247\u024c\5T+\2\u0248\u024c\5Z.\2\u0249\u024a"+
		"\7.\2\2\u024a\u024c\7x\2\2\u024b\u0244\3\2\2\2\u024b\u0246\3\2\2\2\u024b"+
		"\u0247\3\2\2\2\u024b\u0248\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u0255\3\2"+
		"\2\2\u024d\u024e\f\5\2\2\u024e\u0250\7,\2\2\u024f\u0251\5\u008eH\2\u0250"+
		"\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\7-"+
		"\2\2\u0253\u024d\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256O\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025d\5\u00c4"+
		"c\2\u0259\u025a\7/\2\2\u025a\u025c\5\u00c4c\2\u025b\u0259\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025eQ\3\2\2\2"+
		"\u025f\u025d\3\2\2\2\u0260\u0263\5\u008cG\2\u0261\u0263\5P)\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0261\3\2\2\2\u0263S\3\2\2\2\u0264\u0265\7\60\2\2\u0265"+
		"\u0266\7\31\2\2\u0266\u0268\5R*\2\u0267\u0269\5V,\2\u0268\u0267\3\2\2"+
		"\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\7\61\2\2\u026b"+
		"\u026d\5N(\2\u026c\u026e\5X-\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2"+
		"\u026e\u026f\3\2\2\2\u026f\u0270\7\32\2\2\u0270U\3\2\2\2\u0271\u0272\5"+
		"\u00c4c\2\u0272W\3\2\2\2\u0273\u0274\5\u00c4c\2\u0274Y\3\2\2\2\u0275\u0276"+
		"\7(\2\2\u0276\u027c\5H%\2\u0277\u027b\7w\2\2\u0278\u027b\7u\2\2\u0279"+
		"\u027b\5^\60\2\u027a\u0277\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2"+
		"\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u0281\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\7)\2\2\u0280\u0282\5H%"+
		"\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282[\3\2\2\2\u0283\u0284"+
		"\t\5\2\2\u0284]\3\2\2\2\u0285\u0286\t\6\2\2\u0286_\3\2\2\2\u0287\u028b"+
		"\7\21\2\2\u0288\u028a\5b\62\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2"+
		"\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028e\u028f\7\23\2\2\u028fa\3\2\2\2\u0290\u02a0\5f\64\2\u0291"+
		"\u02a0\5h\65\2\u0292\u02a0\5l\67\2\u0293\u02a0\5r:\2\u0294\u02a0\5`\61"+
		"\2\u0295\u02a0\5t;\2\u0296\u02a0\5x=\2\u0297\u02a0\5z>\2\u0298\u02a0\5"+
		"|?\2\u0299\u02a0\5~@\2\u029a\u02a0\5\u0080A\2\u029b\u02a0\5\u0082B\2\u029c"+
		"\u02a0\5n8\2\u029d\u02a0\5p9\2\u029e\u02a0\5\u0084C\2\u029f\u0290\3\2"+
		"\2\2\u029f\u0291\3\2\2\2\u029f\u0292\3\2\2\2\u029f\u0293\3\2\2\2\u029f"+
		"\u0294\3\2\2\2\u029f\u0295\3\2\2\2\u029f\u0296\3\2\2\2\u029f\u0297\3\2"+
		"\2\2\u029f\u0298\3\2\2\2\u029f\u0299\3\2\2\2\u029f\u029a\3\2\2\2\u029f"+
		"\u029b\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2"+
		"\2\2\u02a0c\3\2\2\2\u02a1\u02a2\5\u008eH\2\u02a2\u02a3\7\4\2\2\u02a3e"+
		"\3\2\2\2\u02a4\u02a5\7\65\2\2\u02a5\u02a6\7\31\2\2\u02a6\u02a7\5\u008e"+
		"H\2\u02a7\u02a8\7\32\2\2\u02a8\u02ab\5b\62\2\u02a9\u02aa\7\66\2\2\u02aa"+
		"\u02ac\5b\62\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02acg\3\2\2\2"+
		"\u02ad\u02ae\7\67\2\2\u02ae\u02b0\5\u008eH\2\u02af\u02b1\5\66\34\2\u02b0"+
		"\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\5`"+
		"\61\2\u02b3\u02b5\5j\66\2\u02b4\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7i\3\2\2\2\u02b8\u02bd\78\2\2\u02b9"+
		"\u02bb\5\u00c4c\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u02be\5@!\2\u02bd\u02ba\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c0\5`\61\2\u02c0k\3\2\2\2\u02c1\u02c2\79\2\2\u02c2"+
		"\u02c3\7\31\2\2\u02c3\u02c4\5\u008eH\2\u02c4\u02c5\7\32\2\2\u02c5\u02c6"+
		"\5b\62\2\u02c6m\3\2\2\2\u02c7\u02ca\5\u0086D\2\u02c8\u02ca\5d\63\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02cao\3\2\2\2\u02cb\u02cc\7:\2\2\u02cc"+
		"\u02cd\5`\61\2\u02cdq\3\2\2\2\u02ce\u02cf\7\35\2\2\u02cf\u02d2\7\31\2"+
		"\2\u02d0\u02d3\5n8\2\u02d1\u02d3\7\4\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1"+
		"\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d7\5d\63\2\u02d5\u02d7\7\4\2\2\u02d6"+
		"\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02da\5\u008e"+
		"H\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\7\32\2\2\u02dc\u02dd\5b\62\2\u02dds\3\2\2\2\u02de\u02e0\7;\2\2"+
		"\u02df\u02e1\7\u0084\2\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e6\3\2\2\2\u02e2\u02e3\7\31\2\2\u02e3\u02e4\5v<\2\u02e4\u02e5\7\32"+
		"\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\5\u009cO\2\u02e9u\3\2\2\2\u02ea\u02eb\5\u00ca"+
		"f\2\u02ebw\3\2\2\2\u02ec\u02ed\7<\2\2\u02ed\u02ee\5b\62\2\u02ee\u02ef"+
		"\79\2\2\u02ef\u02f0\7\31\2\2\u02f0\u02f1\5\u008eH\2\u02f1\u02f2\7\32\2"+
		"\2\u02f2\u02f3\7\4\2\2\u02f3y\3\2\2\2\u02f4\u02f5\7s\2\2\u02f5\u02f6\7"+
		"\4\2\2\u02f6{\3\2\2\2\u02f7\u02f8\7o\2\2\u02f8\u02f9\7\4\2\2\u02f9}\3"+
		"\2\2\2\u02fa\u02fc\7=\2\2\u02fb\u02fd\5\u008eH\2\u02fc\u02fb\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7\4\2\2\u02ff\177\3\2\2"+
		"\2\u0300\u0301\7>\2\2\u0301\u0302\7\4\2\2\u0302\u0081\3\2\2\2\u0303\u0304"+
		"\7?\2\2\u0304\u0305\5\u009aN\2\u0305\u0306\7\4\2\2\u0306\u0083\3\2\2\2"+
		"\u0307\u0308\7@\2\2\u0308\u0309\5\u009aN\2\u0309\u030a\7\4\2\2\u030a\u0085"+
		"\3\2\2\2\u030b\u030c\7A\2\2\u030c\u0313\5\u008aF\2\u030d\u0313\5L\'\2"+
		"\u030e\u030f\7\31\2\2\u030f\u0310\5\u0088E\2\u0310\u0311\7\32\2\2\u0311"+
		"\u0313\3\2\2\2\u0312\u030b\3\2\2\2\u0312\u030d\3\2\2\2\u0312\u030e\3\2"+
		"\2\2\u0313\u0316\3\2\2\2\u0314\u0315\7\r\2\2\u0315\u0317\5\u008eH\2\u0316"+
		"\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\7\4"+
		"\2\2\u0319\u0087\3\2\2\2\u031a\u031c\5L\'\2\u031b\u031a\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u0323\3\2\2\2\u031d\u031f\7\22\2\2\u031e\u0320\5"+
		"L\'\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321"+
		"\u031d\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u0089\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u032d\7\31\2\2\u0327"+
		"\u0329\5\u00c4c\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032c\7\22\2\2\u032b\u0328\3\2\2\2\u032c\u032f\3\2\2\2"+
		"\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d"+
		"\3\2\2\2\u0330\u0332\5\u00c4c\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2"+
		"\2\u0332\u0333\3\2\2\2\u0333\u0334\7\32\2\2\u0334\u008b\3\2\2\2\u0335"+
		"\u0336\t\7\2\2\u0336\u008d\3\2\2\2\u0337\u0338\bH\1\2\u0338\u0339\7G\2"+
		"\2\u0339\u034a\5N(\2\u033a\u033b\7\31\2\2\u033b\u033c\5\u008eH\2\u033c"+
		"\u033d\7\32\2\2\u033d\u034a\3\2\2\2\u033e\u033f\t\b\2\2\u033f\u034a\5"+
		"\u008eH\25\u0340\u0341\t\t\2\2\u0341\u034a\5\u008eH\24\u0342\u0343\7I"+
		"\2\2\u0343\u034a\5\u008eH\23\u0344\u0345\7J\2\2\u0345\u034a\5\u008eH\22"+
		"\u0346\u0347\7\b\2\2\u0347\u034a\5\u008eH\21\u0348\u034a\5\u0090I\2\u0349"+
		"\u0337\3\2\2\2\u0349\u033a\3\2\2\2\u0349\u033e\3\2\2\2\u0349\u0340\3\2"+
		"\2\2\u0349\u0342\3\2\2\2\u0349\u0344\3\2\2\2\u0349\u0346\3\2\2\2\u0349"+
		"\u0348\3\2\2\2\u034a\u0395\3\2\2\2\u034b\u034c\f\20\2\2\u034c\u034d\7"+
		"K\2\2\u034d\u0394\5\u008eH\20\u034e\u034f\f\17\2\2\u034f\u0350\t\n\2\2"+
		"\u0350\u0394\5\u008eH\20\u0351\u0352\f\16\2\2\u0352\u0353\t\t\2\2\u0353"+
		"\u0394\5\u008eH\17\u0354\u0355\f\r\2\2\u0355\u0356\t\13\2\2\u0356\u0394"+
		"\5\u008eH\16\u0357\u0358\f\f\2\2\u0358\u0359\7\37\2\2\u0359\u0394\5\u008e"+
		"H\r\u035a\u035b\f\13\2\2\u035b\u035c\7\7\2\2\u035c\u0394\5\u008eH\f\u035d"+
		"\u035e\f\n\2\2\u035e\u035f\7\36\2\2\u035f\u0394\5\u008eH\13\u0360\u0361"+
		"\f\t\2\2\u0361\u0362\t\f\2\2\u0362\u0394\5\u008eH\n\u0363\u0364\f\b\2"+
		"\2\u0364\u0365\t\r\2\2\u0365\u0394\5\u008eH\t\u0366\u0367\f\7\2\2\u0367"+
		"\u0368\7N\2\2\u0368\u0394\5\u008eH\b\u0369\u036a\f\6\2\2\u036a\u036b\7"+
		"\6\2\2\u036b\u0394\5\u008eH\7\u036c\u036d\f\5\2\2\u036d\u036e\7O\2\2\u036e"+
		"\u036f\5\u008eH\2\u036f\u0370\7H\2\2\u0370\u0371\5\u008eH\5\u0371\u0394"+
		"\3\2\2\2\u0372\u0373\f\4\2\2\u0373\u0374\t\16\2\2\u0374\u0394\5\u008e"+
		"H\5\u0375\u0376\f\35\2\2\u0376\u0394\t\b\2\2\u0377\u0378\f\33\2\2\u0378"+
		"\u0379\7,\2\2\u0379\u037a\5\u008eH\2\u037a\u037b\7-\2\2\u037b\u0394\3"+
		"\2\2\2\u037c\u037d\f\32\2\2\u037d\u037f\7,\2\2\u037e\u0380\5\u008eH\2"+
		"\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383"+
		"\7H\2\2\u0382\u0384\5\u008eH\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2"+
		"\u0384\u0385\3\2\2\2\u0385\u0394\7-\2\2\u0386\u0387\f\31\2\2\u0387\u0388"+
		"\7/\2\2\u0388\u0394\5\u00c4c\2\u0389\u038a\f\30\2\2\u038a\u038b\7\21\2"+
		"\2\u038b\u038c\5\u0094K\2\u038c\u038d\7\23\2\2\u038d\u0394\3\2\2\2\u038e"+
		"\u038f\f\27\2\2\u038f\u0390\7\31\2\2\u0390\u0391\5\u0098M\2\u0391\u0392"+
		"\7\32\2\2\u0392\u0394\3\2\2\2\u0393\u034b\3\2\2\2\u0393\u034e\3\2\2\2"+
		"\u0393\u0351\3\2\2\2\u0393\u0354\3\2\2\2\u0393\u0357\3\2\2\2\u0393\u035a"+
		"\3\2\2\2\u0393\u035d\3\2\2\2\u0393\u0360\3\2\2\2\u0393\u0363\3\2\2\2\u0393"+
		"\u0366\3\2\2\2\u0393\u0369\3\2\2\2\u0393\u036c\3\2\2\2\u0393\u0372\3\2"+
		"\2\2\u0393\u0375\3\2\2\2\u0393\u0377\3\2\2\2\u0393\u037c\3\2\2\2\u0393"+
		"\u0386\3\2\2\2\u0393\u0389\3\2\2\2\u0393\u038e\3\2\2\2\u0394\u0397\3\2"+
		"\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u008f\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0398\u03a2\7h\2\2\u0399\u03a2\5\u00c2b\2\u039a\u03a2\5"+
		"\u00c6d\2\u039b\u03a2\5\u00caf\2\u039c\u03a2\5\u00c4c\2\u039d\u03a2\7"+
		"}\2\2\u039e\u03a2\7x\2\2\u039f\u03a2\5\u00c0a\2\u03a0\u03a2\5N(\2\u03a1"+
		"\u0398\3\2\2\2\u03a1\u0399\3\2\2\2\u03a1\u039a\3\2\2\2\u03a1\u039b\3\2"+
		"\2\2\u03a1\u039c\3\2\2\2\u03a1\u039d\3\2\2\2\u03a1\u039e\3\2\2\2\u03a1"+
		"\u039f\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u0091\3\2\2\2\u03a3\u03a8\5\u008e"+
		"H\2\u03a4\u03a5\7\22\2\2\u03a5\u03a7\5\u008eH\2\u03a6\u03a4\3\2\2\2\u03a7"+
		"\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u0093\3\2"+
		"\2\2\u03aa\u03a8\3\2\2\2\u03ab\u03b0\5\u0096L\2\u03ac\u03ad\7\22\2\2\u03ad"+
		"\u03af\5\u0096L\2\u03ae\u03ac\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3"+
		"\u03b5\7\22\2\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u0095\3"+
		"\2\2\2\u03b6\u03b7\5\u00c4c\2\u03b7\u03b8\7H\2\2\u03b8\u03b9\5\u008eH"+
		"\2\u03b9\u0097\3\2\2\2\u03ba\u03bc\7\21\2\2\u03bb\u03bd\5\u0094K\2\u03bc"+
		"\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c3\7\23"+
		"\2\2\u03bf\u03c1\5\u0092J\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c3\3\2\2\2\u03c2\u03ba\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u0099\3\2"+
		"\2\2\u03c4\u03c5\5\u008eH\2\u03c5\u03c6\7\31\2\2\u03c6\u03c7\5\u0098M"+
		"\2\u03c7\u03c8\7\32\2\2\u03c8\u009b\3\2\2\2\u03c9\u03cd\7\21\2\2\u03ca"+
		"\u03cc\5\u009eP\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0"+
		"\u03d1\7\23\2\2\u03d1\u009d\3\2\2\2\u03d2\u03e4\5\u00c4c\2\u03d3\u03e4"+
		"\5\u009cO\2\u03d4\u03e4\5\u00a0Q\2\u03d5\u03e4\5\u00a6T\2\u03d6\u03e4"+
		"\5\u00a8U\2\u03d7\u03e4\5\u00aeX\2\u03d8\u03e4\5\u00b0Y\2\u03d9\u03e4"+
		"\5\u00b2Z\2\u03da\u03e4\5\u00b6\\\2\u03db\u03e4\5\u00ba^\2\u03dc\u03e4"+
		"\5\u00bc_\2\u03dd\u03e4\7o\2\2\u03de\u03e4\7s\2\2\u03df\u03e4\7t\2\2\u03e0"+
		"\u03e4\5\u00c2b\2\u03e1\u03e4\5\u00caf\2\u03e2\u03e4\5\u00c6d\2\u03e3"+
		"\u03d2\3\2\2\2\u03e3\u03d3\3\2\2\2\u03e3\u03d4\3\2\2\2\u03e3\u03d5\3\2"+
		"\2\2\u03e3\u03d6\3\2\2\2\u03e3\u03d7\3\2\2\2\u03e3\u03d8\3\2\2\2\u03e3"+
		"\u03d9\3\2\2\2\u03e3\u03da\3\2\2\2\u03e3\u03db\3\2\2\2\u03e3\u03dc\3\2"+
		"\2\2\u03e3\u03dd\3\2\2\2\u03e3\u03de\3\2\2\2\u03e3\u03df\3\2\2\2\u03e3"+
		"\u03e0\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u009f\3\2"+
		"\2\2\u03e5\u03e9\5\u00a4S\2\u03e6\u03e9\5\u00be`\2\u03e7\u03e9\5\u00a2"+
		"R\2\u03e8\u03e5\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9"+
		"\u00a1\3\2\2\2\u03ea\u03eb\5\u00c4c\2\u03eb\u03ec\7/\2\2\u03ec\u03ed\5"+
		"\u00c4c\2\u03ed\u00a3\3\2\2\2\u03ee\u03f3\7=\2\2\u03ef\u03f3\7.\2\2\u03f0"+
		"\u03f3\7D\2\2\u03f1\u03f3\5\u00c4c\2\u03f2\u03ee\3\2\2\2\u03f2\u03ef\3"+
		"\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3\u0400\3\2\2\2\u03f4"+
		"\u03f6\7\31\2\2\u03f5\u03f7\5\u00a0Q\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03fc\3\2\2\2\u03f8\u03f9\7\22\2\2\u03f9\u03fb\5\u00a0"+
		"Q\2\u03fa\u03f8\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0401\7\32"+
		"\2\2\u0400\u03f4\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u00a5\3\2\2\2\u0402"+
		"\u0403\7Z\2\2\u0403\u0406\5\u00aaV\2\u0404\u0405\7[\2\2\u0405\u0407\5"+
		"\u00a0Q\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u00a7\3\2\2\2"+
		"\u0408\u0409\5\u00aaV\2\u0409\u040a\7[\2\2\u040a\u040b\5\u00a0Q\2\u040b"+
		"\u00a9\3\2\2\2\u040c\u0414\5\u00c4c\2\u040d\u0414\5\u00a2R\2\u040e\u0414"+
		"\5\u00acW\2\u040f\u0410\7\31\2\2\u0410\u0411\5\u00acW\2\u0411\u0412\7"+
		"\32\2\2\u0412\u0414\3\2\2\2\u0413\u040c\3\2\2\2\u0413\u040d\3\2\2\2\u0413"+
		"\u040e\3\2\2\2\u0413\u040f\3\2\2\2\u0414\u00ab\3\2\2\2\u0415\u041a\5\u00c4"+
		"c\2\u0416\u0417\7\22\2\2\u0417\u0419\5\u00c4c\2\u0418\u0416\3\2\2\2\u0419"+
		"\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u00ad\3\2"+
		"\2\2\u041c\u041a\3\2\2\2\u041d\u041e\5\u00a0Q\2\u041e\u041f\7\\\2\2\u041f"+
		"\u0420\5\u00c4c\2\u0420\u00af\3\2\2\2\u0421\u0422\5\u00c4c\2\u0422\u0423"+
		"\7H\2\2\u0423\u00b1\3\2\2\2\u0424\u0425\7]\2\2\u0425\u0429\5\u00a0Q\2"+
		"\u0426\u0428\5\u00b4[\2\u0427\u0426\3\2\2\2\u0428\u042b\3\2\2\2\u0429"+
		"\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u00b3\3\2\2\2\u042b\u0429\3\2"+
		"\2\2\u042c\u042d\7^\2\2\u042d\u042e\5\u00be`\2\u042e\u042f\5\u009cO\2"+
		"\u042f\u0433\3\2\2\2\u0430\u0431\7_\2\2\u0431\u0433\5\u009cO\2\u0432\u042c"+
		"\3\2\2\2\u0432\u0430\3\2\2\2\u0433\u00b5\3\2\2\2\u0434\u0435\7(\2\2\u0435"+
		"\u0436\5\u00c4c\2\u0436\u0438\7\31\2\2\u0437\u0439\5\u00acW\2\u0438\u0437"+
		"\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043c\7\32\2\2"+
		"\u043b\u043d\5\u00b8]\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e\u043f\5\u009cO\2\u043f\u00b7\3\2\2\2\u0440\u0441"+
		"\7`\2\2\u0441\u0442\5\u00acW\2\u0442\u00b9\3\2\2\2\u0443\u0446\7\35\2"+
		"\2\u0444\u0447\5\u009cO\2\u0445\u0447\5\u00a0Q\2\u0446\u0444\3\2\2\2\u0446"+
		"\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044b\5\u00a0Q\2\u0449\u044c"+
		"\5\u009cO\2\u044a\u044c\5\u00a0Q\2\u044b\u0449\3\2\2\2\u044b\u044a\3\2"+
		"\2\2\u044c\u044d\3\2\2\2\u044d\u044e\5\u009cO\2\u044e\u00bb\3\2\2\2\u044f"+
		"\u0450\7\65\2\2\u0450\u0451\5\u00a0Q\2\u0451\u0452\5\u009cO\2\u0452\u00bd"+
		"\3\2\2\2\u0453\u0459\5\u00caf\2\u0454\u0459\7i\2\2\u0455\u0459\7j\2\2"+
		"\u0456\u0459\5\u00c6d\2\u0457\u0459\7h\2\2\u0458\u0453\3\2\2\2\u0458\u0454"+
		"\3\2\2\2\u0458\u0455\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2\2\2\u0459"+
		"\u00bf\3\2\2\2\u045a\u045c\7\31\2\2\u045b\u045d\5\u008eH\2\u045c\u045b"+
		"\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u0464\3\2\2\2\u045e\u0460\7\22\2\2"+
		"\u045f\u0461\5\u008eH\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0463\3\2\2\2\u0462\u045e\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2"+
		"\2\2\u0464\u0465\3\2\2\2\u0465\u0467\3\2\2\2\u0466\u0464\3\2\2\2\u0467"+
		"\u0475\7\32\2\2\u0468\u0471\7,\2\2\u0469\u046e\5\u008eH\2\u046a\u046b"+
		"\7\22\2\2\u046b\u046d\5\u008eH\2\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2"+
		"\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e"+
		"\3\2\2\2\u0471\u0469\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0475\7-\2\2\u0474\u045a\3\2\2\2\u0474\u0468\3\2\2\2\u0475\u00c1\3\2"+
		"\2\2\u0476\u0478\t\17\2\2\u0477\u0479\7k\2\2\u0478\u0477\3\2\2\2\u0478"+
		"\u0479\3\2\2\2\u0479\u00c3\3\2\2\2\u047a\u047b\t\20\2\2\u047b\u00c5\3"+
		"\2\2\2\u047c\u047e\7l\2\2\u047d\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u00c7\3\2\2\2\u0481\u048d\7b"+
		"\2\2\u0482\u0483\7\31\2\2\u0483\u0488\5P)\2\u0484\u0485\7\22\2\2\u0485"+
		"\u0487\5P)\2\u0486\u0484\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2"+
		"\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u048c"+
		"\7\32\2\2\u048c\u048e\3\2\2\2\u048d\u0482\3\2\2\2\u048d\u048e\3\2\2\2"+
		"\u048e\u00c9\3\2\2\2\u048f\u0491\7\u0084\2\2\u0490\u048f\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u00cb\3\2"+
		"\2\2\u0084\u00d7\u00d9\u00e8\u00ec\u00f1\u00f7\u00fb\u00fe\u0103\u0109"+
		"\u0110\u0114\u0121\u0129\u012e\u0138\u013b\u0141\u0149\u014c\u0157\u0161"+
		"\u0163\u0169\u0184\u0187\u0192\u0197\u019c\u01aa\u01ad\u01b4\u01b8\u01ba"+
		"\u01bf\u01c4\u01c7\u01cd\u01d1\u01d5\u01da\u01e7\u01e9\u01f0\u01fa\u0200"+
		"\u020b\u020e\u0214\u0217\u021f\u0222\u0228\u022b\u0233\u0236\u023c\u0240"+
		"\u024b\u0250\u0255\u025d\u0262\u0268\u026d\u027a\u027c\u0281\u028b\u029f"+
		"\u02ab\u02b0\u02b6\u02ba\u02bd\u02c9\u02d2\u02d6\u02d9\u02e0\u02e6\u02fc"+
		"\u0312\u0316\u031b\u031f\u0323\u0328\u032d\u0331\u0349\u037f\u0383\u0393"+
		"\u0395\u03a1\u03a8\u03b0\u03b4\u03bc\u03c0\u03c2\u03cd\u03e3\u03e8\u03f2"+
		"\u03f6\u03fc\u0400\u0406\u0413\u041a\u0429\u0432\u0438\u043c\u0446\u044b"+
		"\u0458\u045c\u0460\u0464\u046e\u0471\u0474\u0478\u047f\u0488\u048d\u0492";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}