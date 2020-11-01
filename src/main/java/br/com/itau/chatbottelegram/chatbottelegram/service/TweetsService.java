package br.com.itau.chatbottelegram.chatbottelegram.service;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.TwittesGateway;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.UserGateway;
import br.com.itau.chatbottelegram.chatbottelegram.gateway.response.DataResponse;
import br.com.itau.chatbottelegram.chatbottelegram.usecase.UseCaseBuscarTwetts;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tweets")
@RequiredArgsConstructor
public class TweetsService {

    private final TwittesGateway gateway;
    private final UserGateway userGateway;
    private final UseCaseBuscarTwetts useCaseBuscarTwetts;

    @ResponseBody
    @GetMapping("/{tag}")
    public DataResponse getByTag(@PathVariable("tag") String tag){
        useCaseBuscarTwetts.executar("#" + tag);
        return gateway.getData("#" + tag);
    }

    @ResponseBody
    @GetMapping("/most-followed/{tag}")
    public List<String> getUsersMostFollowed(@PathVariable("tag") String tag){
        return userGateway.getUsernames("#" + tag);
    }

    @ResponseBody
    @GetMapping("/total-portugues/{tag}")
    public int getTotalInPort(@PathVariable("tag") String tag){
        return gateway.totalEmPortugues("#" + tag);
    }

}
