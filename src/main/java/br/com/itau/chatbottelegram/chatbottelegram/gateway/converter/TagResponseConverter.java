package br.com.itau.chatbottelegram.chatbottelegram.gateway.converter;


import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.TagData;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.TagResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TagResponseConverter {

    public List<TagResponse> convert(List<TagData> tags){
        List<TagResponse> tagResponses = new ArrayList<>();
        for(TagData t : tags){
            TagResponse tagResponse = new TagResponse();
            tagResponse.setDataHoraAtualizacao(t.getDataUltimaAtualizacao());
            tagResponse.setTag(t.getTag());
            tagResponses.add(tagResponse);
        }
        return tagResponses;
    }

}
