package br.com.itau.chatbottelegram.gateway.impl;

import br.com.itau.chatbottelegram.gateway.ITelegram;
import br.com.itau.chatbottelegram.gateway.TagGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Slf4j
@Component
@RequiredArgsConstructor
public class DesafioMarcosBot extends TelegramLongPollingBot implements ITelegram {

    /*TODO
        - refatorar essa classe: colocar o token e nome do bot via properties
    */

    @Value("${bot.authorization.token}")
    private String token;

    @Autowired
    private TagGateway tagGateway;

    @Override
    public String getBotUsername() {
        return "";
    }

    @Override
    public String getBotToken() {
        return "";
    }

    @Override
    public void onUpdateReceived(Update update) {

        SendMessage message = new SendMessage();
        String command = update.getMessage().getText();
        message.setChatId(update.getMessage().getChatId());

        if(command.equals("/tags")){
            message.setText("Com essa opção eu deveria te responder com todas as tags que já foram pesquisadas, mas ainda estou terminando essa funcionalidade.");

        }
        else{
            message.setText("Eu deveria pesquisar essa palavra como uma tag no twitter, já faço a pesquisa e gravo em meu banco de dados, mas a resposta ainda está sob construção.");
        }
        reply(message);

    }

    @Override
    public void reply(SendMessage message) {
        try{
            execute(message);
        }catch (Exception e){
            log.error("Houve um erro ao processar: " + e.getMessage());
        }
    }
}
