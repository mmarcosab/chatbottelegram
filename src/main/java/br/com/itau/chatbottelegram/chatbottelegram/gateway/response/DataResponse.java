package br.com.itau.chatbottelegram.chatbottelegram.gateway.response;

import lombok.*;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataResponse {

    List<String> usersMostFollowed;
    private int quantityInPortuguese;
    private int quantityPerHour;
    
}
