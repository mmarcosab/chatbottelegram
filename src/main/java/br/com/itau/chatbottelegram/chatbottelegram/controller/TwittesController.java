package br.com.itau.chatbottelegram.chatbottelegram.controller;

import br.com.itau.chatbottelegram.chatbottelegram.entity.Twitte;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.TwittesGateway;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.DataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/twittes")
@RequiredArgsConstructor
public class TwittesController {

    private final TwittesGateway gateway;

    @ResponseBody
    @GetMapping("/{tag}")
    public DataResponse getByTag(@PathVariable("tag") String tag){
        return gateway.getTwittesByTag("#" + tag);
    }


}
