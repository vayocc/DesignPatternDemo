package com.cc.template;

public class Tea extends Beverage{
    @Override
    void brew() {
        System.out.println("Tea.酿造");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.添加调味品");
    }

}
