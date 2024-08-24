package com.cc.strategy.sercice.impl;

import com.cc.strategy.sercice.PlatformStrategyService;
import org.springframework.stereotype.Service;

@Service
public class JDPlatformServiceImpl implements PlatformStrategyService {

    @Override
    public String execute() {
        return "这里是京东方法";
    }
}
