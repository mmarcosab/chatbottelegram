package br.com.itau.chatbottelegram.gateway.database.data;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tweet")
@Entity
public class TweetData {

    @Id
    @GeneratedValue
    private long id;
    private String text;
    private String language;
    private Date dataHoraPostagem;
    private String tag;

}