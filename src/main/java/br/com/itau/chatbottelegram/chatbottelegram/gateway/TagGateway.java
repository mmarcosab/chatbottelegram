package br.com.itau.chatbottelegram.chatbottelegram.gateway;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.TagData;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.TagResponse;

import java.util.List;

public interface TagGateway {
    void save(TagData tagData);
    List<TagResponse> getTags();
}
