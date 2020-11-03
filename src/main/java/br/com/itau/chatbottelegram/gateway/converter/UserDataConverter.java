package br.com.itau.chatbottelegram.gateway.converter;

import br.com.itau.chatbottelegram.gateway.database.data.UserData;
import org.springframework.stereotype.Component;
import twitter4j.User;

@Component
public class UserDataConverter {

    public UserData convert(User user, String tag){
        UserData userData = new UserData();
        userData.setUsername(user.getName());
        userData.setQuantityOfFollowers(user.getFollowersCount());
        userData.setTag(tag);
        return userData;
    }

}
