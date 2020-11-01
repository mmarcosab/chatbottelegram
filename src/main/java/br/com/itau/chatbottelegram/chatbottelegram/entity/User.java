package br.com.itau.chatbottelegram.chatbottelegram.entity;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private int quantityOfFollowers;

}