package br.com.itau.chatbottelegram.gateway.database.data;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tag")
@Entity
public class TagData {

    @Id
    @GeneratedValue
    private long id;
    private String tag;
    private Date dataUltimaAtualizacao;

}
