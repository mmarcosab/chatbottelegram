package br.com.itau.chatbottelegram.gateway;

import br.com.itau.chatbottelegram.gateway.database.data.UserData;

import java.util.List;

public interface UserGateway {
    void save(UserData user);
    List<String> getUsernames(String tag);
}
