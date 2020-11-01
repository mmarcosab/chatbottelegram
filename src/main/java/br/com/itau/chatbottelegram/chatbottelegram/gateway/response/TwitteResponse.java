package br.com.itau.chatbottelegram.chatbottelegram.gateway.response;

import lombok.*;
import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TwitteResponse {

    private String user;
    private String text;
    private String language;
    private Date dataHoraPostagem;

}
