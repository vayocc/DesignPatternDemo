package com.cc.strategy.sercice.impl;

import com.cc.strategy.sercice.PlatformStrategyService;
import org.springframework.stereotype.Service;

@Service
public class TaobaoPlatformServiceImpl implements PlatformStrategyService {

    @Override
    public String execute() {
        return "这里是淘宝方法";
    }
}
