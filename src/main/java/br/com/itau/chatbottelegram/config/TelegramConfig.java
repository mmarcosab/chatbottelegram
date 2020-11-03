package br.com.itau.chatbottelegram.config;

import br.com.itau.chatbottelegram.gateway.ITelegram;
import br.com.itau.chatbottelegram.gateway.impl.DesafioMarcosBot;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Configuration
@RequiredArgsConstructor
public class TelegramConfig {

    //TODO - é um rascunho da criação de um bean, entender porque não tá rolando ..

    private final DesafioMarcosBot bot;

    public TelegramBotsApi registerBot(){
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(bot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return telegramBotsApi;
    }
}
