package br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class UserData {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private int quantityOfFollowers;
    private String tag;

}