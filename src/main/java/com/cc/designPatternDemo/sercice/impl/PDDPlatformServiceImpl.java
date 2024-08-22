package com.cc.designPatternDemo.sercice.impl;

import com.cc.designPatternDemo.sercice.PlatformStrategyService;
import org.springframework.stereotype.Service;

@Service
public class PDDPlatformServiceImpl implements PlatformStrategyService {

    @Override
    public String execute() {
        return "这里是拼多多方法";
    }
}
