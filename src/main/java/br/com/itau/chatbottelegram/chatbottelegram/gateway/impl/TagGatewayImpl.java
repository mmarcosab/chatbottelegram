package br.com.itau.chatbottelegram.chatbottelegram.gateway.impl;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.TagGateway;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.converter.TagResponseConverter;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.TagData;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.repository.TagRepository;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.TagResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class TagGatewayImpl implements TagGateway {

    private final TagRepository tagRepository;
    private final TagResponseConverter tagResponseConverter;

    @Override
    public void save(TagData tag) {
        tagRepository.save(tag);
    }

    @Override
    public List<TagResponse> getTags() {
        return tagResponseConverter.convert(tagRepository.findAll());
    }

}
