package com.ChiquiBot.net;

import com.ChiquiBot.core.BotMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpClientTest {

    @Test
    void POST() throws Exception {
    HttpClient.POST("https://api.telegram.org/bot834962965:AAG0S_TVvZrGtzE5hYVGbpSevfoiAGsuy7k/sendmessage",
            new BotMessage(46243831,"Hola soy Guix enviando un mensaje a traves del Metodo POST"));
    }
}