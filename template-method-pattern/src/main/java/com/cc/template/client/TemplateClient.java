package com.cc.template.client;

import com.cc.template.Beverage;
import com.cc.template.Coffee;
import com.cc.template.Tea;

public class TemplateClient {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        beverage.prepareRecipe();
        System.out.println("-----------");
        beverage = new Tea();
        beverage.prepareRecipe();
    }

}
