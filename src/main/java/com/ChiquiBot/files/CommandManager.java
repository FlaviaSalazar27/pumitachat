package com.ChiquiBot.files;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

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
}
