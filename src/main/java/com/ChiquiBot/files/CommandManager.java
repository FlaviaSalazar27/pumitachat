package com.ChiquiBot.files;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class CommandManager {

    public String manageURL(String command){
        String url ="";
        if ("/Achumani".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/pdf/Mapa%20Oficial%20Achumani.pdf";
        }
        if ("/Chasquipampa".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutachasquipampa.pdf";
        }
        if ("/Tarifa".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/slide/tarifario_nuevo1.png";
        }
        return url;
    }
    public String manageImage(String command){
        String url ="";

        if ("/Chasquipampa".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutachasquipampa.pdf";
        }
        return url;
    }
    public SendMessage CreateKeyboard(String command, long chat_id){
        SendMessage message = new SendMessage().setChatId(chat_id);
        if (command.equals("/menu")) {
          message.setText("Menu Principal");
            // Create ReplyKeyboardMarkup object
            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
            // Create the keyboard (list of keyboard rows)
            List<KeyboardRow> keyboard = new ArrayList<>();
            // Create a keyboard row
            KeyboardRow row = new KeyboardRow();
            // Set each button, you can also use KeyboardButton objects if you need something else than text
            row.add("\uD83D\uDE8C Ruta Chasquipampa");
            row.add(" \uD83D\uDE8C Ruta Achumani");

            // Add the first row to the keyboard
            keyboard.add(row);
            // Create another keyboard row
            row = new KeyboardRow();
            // Set each button for the second line
            row.add("\uD83D\uDCB0 Tarifario");
            row.add(" ⏰ Horarios");

            // Add the second row to the keyboard
            keyboard.add(row);
            // Set the keyboard to the markup
            keyboardMarkup.setKeyboard(keyboard);
            // Add it to the message
            message.setReplyMarkup(keyboardMarkup);

        }
        return message;
    }
}
