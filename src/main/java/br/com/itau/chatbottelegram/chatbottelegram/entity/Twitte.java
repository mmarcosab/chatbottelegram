package br.com.itau.chatbottelegram.chatbottelegram.entity;

import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Twitte {

    private String user;
    private String text;
    private String language;
    private Date dataHoraPostagem;

}
