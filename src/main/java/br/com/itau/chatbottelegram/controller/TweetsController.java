package br.com.itau.chatbottelegram.controller;

import br.com.itau.chatbottelegram.gateway.TwittesGateway;
import br.com.itau.chatbottelegram.gateway.UserGateway;
import br.com.itau.chatbottelegram.gateway.response.DataResponse;
import br.com.itau.chatbottelegram.usecase.UseCaseBuscarTwetts;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping(value = "/tweets")
@RequiredArgsConstructor
public class TweetsController {

    private final TwittesGateway gateway;
    private final UserGateway userGateway;
    private final UseCaseBuscarTwetts useCaseBuscarTwetts;

    @ApiOperation("Usa a palavra passada como pathVariable e pesquisa no twitter os últimos 100 posts com essa palavra usada como tag")
    @ResponseBody
    @GetMapping("/{tag}")
    public DataResponse getByTag(@PathVariable("tag") String tag){
        useCaseBuscarTwetts.executar("#" + tag);
        return gateway.getData("#" + tag);
    }

    @ApiOperation("Usa a palavra passada como pathVariable e pesquisa no banco de dados os usuários com mais seguidores para essa tag")
    @ResponseBody
    @GetMapping("/most-followed/{tag}")
    public List<String> getUsersMostFollowed(@PathVariable("tag") String tag){
        return userGateway.getUsernames("#" + tag);
    }

    @ApiOperation("Usa a palavra passada como pathVariable e pesquisa no banco de dados todos os tweets em portuguÊs usando essa palavra como tag")
    @ResponseBody
    @GetMapping("/total-portugues/{tag}")
    public int getTotalInPort(@PathVariable("tag") String tag){
        return gateway.totalEmPortugues("#" + tag);
    }

}
