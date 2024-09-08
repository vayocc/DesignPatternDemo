package com.cc.responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 首先，我们要抽象出请求对象，它将在责任链上传递：
 */
@Data
@AllArgsConstructor
public class Request {
    private String name;
    private BigDecimal amount;



}
