package com.ChiquiBot.core;

public class BotMessage {
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

}
