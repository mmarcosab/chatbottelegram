package br.com.itau.chatbottelegram.chatbottelegram.gateway.impl;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.TwittesGateway;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.DataResponse;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.TwitteResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class TwittesGatewayImpl implements TwittesGateway {

    @Override
    public DataResponse getTwittesByTag(String tag) {

        DataResponse dataResponse = new DataResponse();

        Twitter twitter = new TwitterFactory().getInstance();
        Query query = new Query("from: "+ tag);
        query.setCount(100);
        query.setSince("2018-01-01");

        List<TwitteResponse> twittes = new ArrayList<>();

        try{
            QueryResult result = twitter.search(query);
            System.out.println("Count : " + result.getTweets().size()) ;
            for (Status tweet : result.getTweets()) {
                TwitteResponse twitte = new TwitteResponse();
                twitte.setDataHoraPostagem(tweet.getCreatedAt());
                twitte.setLanguage(tweet.getLang());
                twitte.setText(tweet.getText());
                twitte.setUser(tweet.getUser().getName());
                twittes.add(twitte);
            }
        } catch (TwitterException te){
            log.info("Houve um erro ao pesquisar pela tag solicitada: {} -- ERRO: {}", tag, te.getMessage());
        }
        dataResponse.setTwittes(twittes);
        return dataResponse;
    }

}
