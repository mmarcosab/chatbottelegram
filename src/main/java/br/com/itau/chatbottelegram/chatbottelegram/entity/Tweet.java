package br.com.itau.chatbottelegram.chatbottelegram.entity;

import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tweet {

    private User user;
    private String text;
    private String language;
    private Date dataHoraPostagem;

}
