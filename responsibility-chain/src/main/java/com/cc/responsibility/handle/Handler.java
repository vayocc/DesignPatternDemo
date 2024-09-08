package com.cc.responsibility.handle;

import com.cc.responsibility.Request;

/**
 * 其次，我们要抽象出处理器：
 */

public abstract class Handler {

    // 返回Boolean.TRUE = 成功
    // 返回Boolean.FALSE = 拒绝
    // 返回null = 交下一个处理
    abstract Boolean process(Request request);

    Boolean ignoreName(String name){
        return !name.equalsIgnoreCase("bob");
    }
}
