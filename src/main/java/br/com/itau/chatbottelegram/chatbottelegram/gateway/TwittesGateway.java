package br.com.itau.chatbottelegram.chatbottelegram.gateway;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.DataResponse;

public interface TwittesGateway {
    DataResponse getTwittesByTag(String tag);
}
