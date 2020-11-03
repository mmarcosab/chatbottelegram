package br.com.itau.chatbottelegram;

import br.com.itau.chatbottelegram.gateway.impl.DesafioMarcosBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class ChatbottelegramApplication {

	/*TODO
        - refatorar essa classe: criar bean de configuração para TelegramBotsApi
    */


	public static void main(String[] args) {
		ApiContextInitializer.init();
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

		try {
			telegramBotsApi.registerBot(new DesafioMarcosBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		SpringApplication.run(ChatbottelegramApplication.class, args);
	}

}
