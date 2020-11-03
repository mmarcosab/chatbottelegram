package br.com.itau.chatbottelegram.controller;

import br.com.itau.chatbottelegram.gateway.TagGateway;
import br.com.itau.chatbottelegram.gateway.response.TagResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping(value = "/tags")
@RequiredArgsConstructor
public class TagController {

    private final TagGateway tagGateway;

    @ApiOperation("Lista todas as tags que já foram pesquisadas, junto com as datas em que foram pesquisadas")
    @ResponseBody
    @GetMapping
    public List<TagResponse> getByTag(){
        return tagGateway.getTags();
    }

}
