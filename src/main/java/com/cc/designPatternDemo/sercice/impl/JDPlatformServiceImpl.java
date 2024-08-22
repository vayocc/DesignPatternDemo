package com.cc.designPatternDemo.sercice.impl;

import com.cc.designPatternDemo.sercice.PlatformStrategyService;
import org.springframework.stereotype.Service;

@Service
public class JDPlatformServiceImpl implements PlatformStrategyService {

    @Override
    public String execute() {
        return "这里是京东方法";
    }
}
