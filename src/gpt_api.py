import os

import openai
from openai import OpenAI
from config import *
import httpx
import certifi

GPT_MODEL = "gpt-4.5-preview"
# os.environ['OPENAI_API_KEY'] = API_KEY
os.environ['OPENAI_API_KEY'] = API_KEY
client = OpenAI(
    api_key=API_KEY,
    http_client=httpx.Client(verify=certifi.where())
)
seed = 123


def chat_with_gpt(conversation_history, user_input, json=True):
    '''
    conversation_history: a list of dict, each dict has two keys: role, content
    user_input: a string
    '''
    # Combine previous conversation with new user input
    # prompt = conversation_history + f"\nUser: {user_input}\nAI:"
    openai.api_key = os.getenv('OPENAI_API_KEY')
    # Call the OpenAI API
    msg = conversation_history
    msg.append({
            "role": "system",
            "content": user_input,
        })
    
    model_config = {
        'temperature': 0,
        'messages': msg,
        'model': GPT_MODEL,
        # 'stop': ["\n\n", "\n\t\n", "\n    \n"],
    }
    
    # if json:
    #     model_config['response_format'] = {"type": "json_object"}
        
    # print("model_config)", model_config)
    
    chat_completion = client.chat.completions.create(**model_config)
    token_used = chat_completion.usage
    ai_text = chat_completion.choices[0].message.content
    # Extract the response text

    # Update the conversation history
    msg.append({
        "role": "assistant",
        "content": ai_text,
    })

    return ai_text, msg, token_used
