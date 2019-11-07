package com.ChiquiBot.core;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.generics.UpdatesHandler;

public class FileSenderBotApi implements UpdatesHandler {

    public  void  onUpdate(Update update){
        int chatId = Integer.parseInt(String.valueOf(update.getMessage().getChat().getId()));
        String text = update.getMessage().getText();
        String user = update.getMessage().getFrom().getFirstName();
        new BotMessage(chatId,text + " - "+ user).send();

    }
}
