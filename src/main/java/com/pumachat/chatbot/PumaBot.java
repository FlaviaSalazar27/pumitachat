package com.pumachat.chatbot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.List;
public class PumaBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(final Update update) {



        // Se obtiene el mensaje escrito por el usuario
        final String messageTextReceived = update.getMessage().getText();
        // Se obtiene el id de chat del usuario
        final long chatId = update.getMessage().getChatId();

        // Enviar Rutas PDF
        if (messageTextReceived == "Rutas"){
            SendMessage message = new SendMessage().setChatId(chatId).setText("Por favor ingrese la linea que quiere consultar (San Pedro, Achumani, Chasquipampa, PUC)");
            final String ruta = update.getMessage().getText();
            SendMessage rutas = new SendMessage().setChatId(chatId).setText(sendRoutes(ruta));
        }



        // Se crea un objeto mensaje
      /*  SendMessage message = new SendMessage().setChatId(chatId).setText("Aqui deberia repetirte el mensaje pero guix lo cambio");

        try {
            // Se envía el mensaje
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }*/

        if (messageTextReceived.equals("/teclado")) {
            SendMessage message = new SendMessage()
                    .setChatId(chatId)
                    .setText("Aqui esta el teclado");
            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboard = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add("Opcion 1");
            row.add("Opcion  2");
            keyboard.add(row);
            row = new KeyboardRow();
            row.add("Opcion 3");
            row.add("Opcion 4");
            keyboard.add(row);
            keyboardMarkup.setKeyboard(keyboard);

            message.setReplyMarkup(keyboardMarkup);
            try {
                sendMessage(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (messageTextReceived.equals("Opcion 1")) {
            SendMessage message = new SendMessage()
                    .setChatId(chatId)
                    .setText("A elegido la opcion 1");
            try {
                sendMessage(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        }


//llamar sendPDF.java
    private String sendRoutes(String ruta) {
        SendPDF r = new SendPDF();
        return r.SendRoute(ruta);
    }


    @Override
    public String getBotUsername() {
        // Se devuelve el nombre que dimos al bot al crearlo con el BotFather
        return "PumaBot";
    }

    @Override
    public String getBotToken() {
        // Se devuelve el token que nos generó el BotFather de nuestro bot
        return "834962965:AAESMhqhbNeOd7w3Gdd2tWKadDYKs3ejqXg";
    }
}