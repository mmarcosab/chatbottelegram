package br.com.itau.chatbottelegram.chatbottelegram.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/telegram")
public class TelegramService {

    private final String endpoint = "https://api.telegram.org/";
    private final String token = "1335287928:AAGW5__QA1MlI_SPWTa_NeOdIHbI88-i26k";

}
