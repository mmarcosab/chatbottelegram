package br.com.itau.chatbottelegram.chatbottelegram.service;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.TagGateway;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.TagResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tags")
@RequiredArgsConstructor
public class TagService {

    private final TagGateway tagGateway;

    @ResponseBody
    @GetMapping
    public List<TagResponse> getByTag(){
        return tagGateway.getTags();
    }

}
