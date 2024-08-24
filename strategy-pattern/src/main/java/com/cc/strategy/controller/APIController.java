package com.cc.strategy.controller;


import com.cc.strategy.enums.PlatformPublishesEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("strategy")
@RequiredArgsConstructor
public class APIController {

    @GetMapping("strategy")
    public String strategy(String type){
        return PlatformPublishesEnum.getStrategyInstance(type).execute();
    }

    @GetMapping("test")
    public String test(){
        return "e";
    }
}
