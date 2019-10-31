package com.ChiquiBot.core;

import com.ChiquiBot.net.HttpClient;

public class BotMessage {
    private static final String TELEGRAM_BOT_URL="https://api.telegram.org/bot834962965:AAG0S_TVvZrGtzE5hYVGbpSevfoiAGsuy7k";
    private final int chat_id;
    private final String text;

    public BotMessage(int chat_id, String text) {
        this.chat_id = chat_id;
        this.text = text;
    }

    public int getChat_id() {
        return chat_id;
    }

    public String getText() {
        return text;
    }

    public void send (){
        HttpClient.POST(TELEGRAM_BOT_URL + "/sendMessage", this );
    }
}
