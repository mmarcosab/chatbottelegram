package br.com.itau.chatbottelegram.chatbottelegram.gateway.converter;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.TweetData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import twitter4j.Status;

@Component
@RequiredArgsConstructor
public class TweetDataConverter {

    private final UserDataConverter userDataConverter;
    private final DataResponseConverter dataREsponseConverter;

    public TweetData convert(Status tweet, String tag){

        TweetData tweetData = new TweetData();
        tweetData.setLanguage(tweet.getLang());
        tweetData.setText(tweet.getText());
        tweetData.setDataHoraPostagem(tweet.getCreatedAt());
        tweetData.setTag(tag);

        return tweetData;

    }

}
