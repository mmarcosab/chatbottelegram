package br.com.itau.chatbottelegram.gateway;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface ITelegram {
    void reply(SendMessage message);
}
