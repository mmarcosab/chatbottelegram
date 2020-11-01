package br.com.itau.chatbottelegram.chatbottelegram.gateway.impl;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.UserGateway;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.UserData;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserRepository userRepository;

    @Override
    public void save(UserData user) {
        log.info("Armazenando usuario: {}", user);
        userRepository.save(user);
        log.info("Usuario armazenado: {}", user);
    }

    @Override
    public List<String> getUsernames(String tag) {
        log.info("Buscando usuários mais seguidos de acordo com a tag: {}", tag);
        return userRepository.getUsersMostFollowed(tag);
    }
}
