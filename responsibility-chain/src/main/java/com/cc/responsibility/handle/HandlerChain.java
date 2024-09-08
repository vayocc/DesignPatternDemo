package com.cc.responsibility.handle;

import com.cc.responsibility.Request;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    // 持有所有Handler:
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public boolean process(Request request) {
        // 依次调用每个Handler:
        for (Handler handler : handlers) {
            Boolean r = handler.process(request);
            if (r != null) {
                // 如果返回TRUE或FALSE，处理结束:
                System.out.println(request + " " + (r ? "批准 by " : "拒绝 by ") + handler.getClass().getSimpleName());
                return r;
            }
        }
        throw new RuntimeException("无法处理请求: " + request);
    }

}
