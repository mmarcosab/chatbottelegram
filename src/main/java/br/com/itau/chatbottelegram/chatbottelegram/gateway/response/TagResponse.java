package br.com.itau.chatbottelegram.chatbottelegram.gateway.response;

import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TagResponse {

    private String tag;
    private Date dataHoraAtualizacao;

}
