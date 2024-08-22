package com.cc.designPatternDemo.sercice.impl;

import com.cc.designPatternDemo.sercice.PlatformStrategyService;
import org.springframework.stereotype.Service;

@Service
public class DouYinPlatformServiceImpl implements PlatformStrategyService {

    @Override
    public String execute() {
        return "这里是抖音方法";
    }
}
