package com.ChiquiBot.ChiquiBot;

import com.ChiquiBot.core.Chiqui;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
//import org.telegram.telegrambots.meta.TelegramBotsApi;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class ChiquiBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChiquiBotApplication.class, args);
		ApiContextInitializer.init();

		// Se crea un nuevo Bot API
		final TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

		try {
			// Se registra el bot
			telegramBotsApi.registerBot(new Chiqui());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
