package com.ChiquiBot.core;
import com.ChiquiBot.files.CommandManager;
import com.ChiquiBot.files.PhotoIdentifier;
import org.slf4j.ILoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class Chiqui extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(final Update update) {

        // Esta función se invocará cuando nuestro bot reciba un mensaje
       /* File doc = new File();
        */
       CommandManager comand = new CommandManager();
        final String messageTextReceived = update.getMessage().getText();

        // Se obtiene el id de chat del usuario
        final long chatId = update.getMessage().getChatId();
        final String nombre = update.getMessage().getFrom().getFirstName();
        String mensaje = comand.manageImage(messageTextReceived);

        SendDocument message = new SendDocument().setChatId(chatId).setDocument(mensaje);
        if (messageTextReceived.equals("/menu")){

            CommandManager commandManager = new CommandManager();
            SendMessage keyboard = commandManager.CreateKeyboard("/menu", chatId);
            try {
                // Se envía el mensaje
                execute(keyboard);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        try {
            // Se envía el mensaje
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        //Codigo para saber el File ID de una imagen, se debe poner como comentario cuando no sea necesario
      /*  if (update.hasMessage() && update.getMessage().hasPhoto()) {
            PhotoIdentifier img = new PhotoIdentifier();
            SendPhoto msg = img.getImageDetails(update.getMessage().getPhoto(),chatId);

            try {
                execute(msg); // Call method to send the photo with caption
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }*/
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