package br.com.itau.chatbottelegram.gateway;

import br.com.itau.chatbottelegram.gateway.database.data.TagData;
import br.com.itau.chatbottelegram.gateway.response.TagResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TagGateway {
    void save(TagData tagData);
    List<TagResponse> getTags();
}
