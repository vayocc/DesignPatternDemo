package com.cc.responsibility;

import com.cc.responsibility.handle.CEOHandler;
import com.cc.responsibility.handle.DirectorHandler;
import com.cc.responsibility.handle.HandlerChain;
import com.cc.responsibility.handle.ManagerHandler;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {

        // 构造责任链:
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());
// 处理请求:
        chain.process(new Request("Bob", new BigDecimal("123.45")));
        chain.process(new Request("Alice", new BigDecimal("1234.56")));
        chain.process(new Request("Bill", new BigDecimal("12345.67")));
        chain.process(new Request("John", new BigDecimal("123456.78")));
    }
}
