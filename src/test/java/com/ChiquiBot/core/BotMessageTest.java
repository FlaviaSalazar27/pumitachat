package com.ChiquiBot.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotMessageTest {

    @Test
    void send() throws Exception {
    new BotMessage(46243831, "Holi estoy enviando el mensaje a traves de POST").send();
    }
}