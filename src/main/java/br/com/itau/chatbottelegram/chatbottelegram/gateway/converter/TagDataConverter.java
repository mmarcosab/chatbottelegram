package br.com.itau.chatbottelegram.chatbottelegram.gateway.converter;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.TagData;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TagDataConverter {

    public TagData convert(String tag){
        TagData tagData = new TagData();
        tagData.setTag(tag);
        tagData.setDataUltimaAtualizacao(new Date());
        return tagData;
    }

}
