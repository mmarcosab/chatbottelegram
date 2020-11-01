package br.com.itau.chatbottelegram.chatbottelegram.usecase.impl;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.TwittesGateway;
import br.com.itau.chatbottelegram.chatbottelegram.usecase.UseCaseBuscarTwetts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UseCaseBuscarTweetsImpl implements UseCaseBuscarTwetts {

    private final TwittesGateway gateway;

    @Override
    public void executar(String tag){
        gateway.saveConsulta(tag);
    }

}
