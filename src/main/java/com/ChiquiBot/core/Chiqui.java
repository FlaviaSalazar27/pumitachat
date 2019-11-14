package com.ChiquiBot.core;
import org.slf4j.ILoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

<<<<<<< HEAD
import java.util.logging.Logger;

public class Chiqui extends TelegramLongPollingBot {
=======
public class Chiqui extends TelegramLongPollingBot implements Chiqui22 {
>>>>>>> 50a25c249ef48ad6f14b23eacf53abf10c2973bc

    @Override
    public void onUpdateReceived(final Update update) {
        // Esta función se invocará cuando nuestro bot reciba un mensaje
       /* File doc = new File();
        */
        final String messageTextReceived = update.getMessage().getText();

        // Se obtiene el id de chat del usuario
        final long chatId = update.getMessage().getChatId();
        final String nombre = update.getMessage().getFrom().getFirstName();
        String mensaje ="http://amn.bo/wp-content/uploads/2019/08/69112080_1638670066269349_8967221364142374912_n.jpg";
        
        SendDocument message = new SendDocument().setChatId(chatId).setDocument("http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutachasquipampa.pdf");

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