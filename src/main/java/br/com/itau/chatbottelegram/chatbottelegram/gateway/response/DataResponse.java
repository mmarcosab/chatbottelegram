package br.com.itau.chatbottelegram.chatbottelegram.gateway.response;

import lombok.*;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataResponse {

    private List<TwitteResponse> twittes;
    private int quantityInPortuguese;
    private int quantityPerHour;

}
