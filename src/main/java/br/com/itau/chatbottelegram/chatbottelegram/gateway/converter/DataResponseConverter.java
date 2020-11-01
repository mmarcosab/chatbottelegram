package br.com.itau.chatbottelegram.chatbottelegram.gateway.converter;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.DataResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataResponseConverter {

    public DataResponse convert(List<String> usernames, int qtdePortugues, int q1tdePorHora){
        DataResponse dataResponse = new DataResponse();
        dataResponse.setUsersMostFollowed(usernames);
        dataResponse.setQuantityInPortuguese(qtdePortugues);
        dataResponse.setQuantityPerHour(q1tdePorHora);
        return dataResponse;
    }

}
