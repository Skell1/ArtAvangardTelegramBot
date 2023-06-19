package ru.artAvangard.TelegramBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
@EnableScheduling
public class TelegramBotApplication {

	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(TelegramBotApplication.class, args);
	}
}
