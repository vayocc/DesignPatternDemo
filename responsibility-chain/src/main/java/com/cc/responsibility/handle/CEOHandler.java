package com.cc.responsibility.handle;

import com.cc.responsibility.Request;

import java.math.BigDecimal;

public class CEOHandler extends Handler{

    @Override
    Boolean process(Request request) {
        // 如果超过100000元，处理不了，交下一个处理:
//        if (request.getAmount().compareTo(BigDecimal.valueOf(100000)) > 0) {
//            return null;
//        }
        // 对Bob有偏见:
        return ignoreName(request.getName());
    }
}
