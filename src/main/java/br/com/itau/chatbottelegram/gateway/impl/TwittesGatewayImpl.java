package br.com.itau.chatbottelegram.gateway.impl;

import br.com.itau.chatbottelegram.gateway.TagGateway;
import br.com.itau.chatbottelegram.gateway.TwittesGateway;
import br.com.itau.chatbottelegram.gateway.UserGateway;
import br.com.itau.chatbottelegram.gateway.converter.DataResponseConverter;
import br.com.itau.chatbottelegram.gateway.converter.TagDataConverter;
import br.com.itau.chatbottelegram.gateway.converter.TweetDataConverter;
import br.com.itau.chatbottelegram.gateway.converter.UserDataConverter;
import br.com.itau.chatbottelegram.gateway.database.data.TweetData;
import br.com.itau.chatbottelegram.gateway.database.data.UserData;
import br.com.itau.chatbottelegram.gateway.database.repository.TweetRepository;
import br.com.itau.chatbottelegram.gateway.response.DataResponse;
import br.com.itau.chatbottelegram.gateway.response.TwitteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class TwittesGatewayImpl implements TwittesGateway {

    private final TweetRepository tweetRepository;
    private final TagGateway tagGateway;
    private final UserGateway userGateway;
    private final UserDataConverter userDataConverter;
    private final TagDataConverter tagDataConverter;
    private final TweetDataConverter tweetDataConverter;
    private final DataResponseConverter dataResponseConverter;

    @Override
    public void saveConsulta(String tag) {

        DataResponse dataResponse = new DataResponse();

        Twitter twitter = new TwitterFactory().getInstance();
        Query query = new Query("from: "+ tag);
        query.setCount(100);
        query.setSince("2018-01-01");

        List<TwitteResponse> twittes = new ArrayList<>();

        // Criando as listas
        List<UserData> users = new ArrayList<>();
        List<TweetData> tweets = new ArrayList<>();

        int x = 0;

        try{
            QueryResult result = twitter.search(query);
            System.out.println("Count : " + result.getTweets().size()) ;
            for (Status tweet : result.getTweets()) {
                UserData userData = userDataConverter.convert(tweet.getUser(), tag);
                TweetData tweetData = tweetDataConverter.convert(tweet, tag);
                users.add(userData);
                tweets.add(tweetData);
            }
        } catch (TwitterException te){
            log.info("Houve um erro ao pesquisar pela tag solicitada: {} -- ERRO: {}", tag, te.getMessage());
        }


        tagGateway.save(tagDataConverter.convert(tag));
        for(TweetData t : tweets) {
            tweetRepository.save(t);
        }
        for(UserData user : users) {
            userGateway.save(user);
        }

    }

    @Override
    public void save(TweetData tweet) {
        log.info("Armazenando tweet: {}", tweet);
        tweetRepository.save(tweet);
        log.info("Tweet armazenado: {}", tweet);
    }

    @Override
    public DataResponse getData(String tag) {
        return dataResponseConverter.convert(userGateway.getUsernames(tag), tweetRepository.getCountPortuguese(tag), 10);
    }

    @Override
    public int totalEmPortugues(String tag) {
        return tweetRepository.getCountPortuguese(tag);
    }


}
