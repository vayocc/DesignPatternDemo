package com.cc.designPatternDemo.controller;


import com.cc.designPatternDemo.enums.PlatformPublishesEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class APIController {

    @GetMapping("strategy")
    public String strategy(String type){
        return PlatformPublishesEnum.getStrategyInstance(type).execute();
    }
}
