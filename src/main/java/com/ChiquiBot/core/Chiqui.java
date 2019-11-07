package com.ChiquiBot.core;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Chiqui extends TelegramLongPollingBot implements Chiqui22 {

    @Override
    public void onUpdateReceived(final Update update) {
        // Esta función se invocará cuando nuestro bot reciba un mensaje
       /* File doc = new File();
        doc.getFileUrl("834962965:AAG0S_TVvZrGtzE5hYVGbpSevfoiAGsuy7k","http://www.lapazbus.bo/fileman/Uploads/files/pdf/Mapa%20Oficial%20Achumani.pdf");
        */// Se obtiene el mensaje escrito por el usuario
        final String messageTextReceived = update.getMessage().getText();

        // Se obtiene el id de chat del usuario
        final long chatId = update.getMessage().getChatId();
        final String nombre = update.getMessage().getFrom().getFirstName();
        String mensaje ="http://www.lapazbus.bo";
        // Se crea un objeto mensaje
        SendMessage message = new SendMessage().setChatId(chatId).setText(mensaje);

        try {
            // Se envía el mensaje
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onUpdateReceived(org.telegram.telegrambots.api.objects.Update update) {

    }

    @Override
    public String getBotUsername() {
        // Se devuelve el nombre que dimos al bot al crearlo con el BotFather
        return "Chiqui";
    }

    @Override
    public String getBotToken() {
        // Se devuelve el token que nos generó el BotFather de nuestro bot
        return "834962965:AAG0S_TVvZrGtzE5hYVGbpSevfoiAGsuy7k";
    }
}