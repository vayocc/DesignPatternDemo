package com.cc.template;

public class Coffee extends Beverage{
    @Override
    void brew() {
        System.out.println("Coffee.酿造");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.添加调味品");
    }

}
