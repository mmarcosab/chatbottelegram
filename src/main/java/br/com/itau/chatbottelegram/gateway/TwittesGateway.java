package br.com.itau.chatbottelegram.gateway;

import br.com.itau.chatbottelegram.gateway.database.data.TweetData;
import br.com.itau.chatbottelegram.gateway.response.DataResponse;

public interface TwittesGateway {
    void saveConsulta(String tag);
    void save(TweetData tweet);
    DataResponse getData(String tag);
    int totalEmPortugues(String tag);
}
