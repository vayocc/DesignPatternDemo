package com.cc.template;

public abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("烧开水");
    }

    void pourInCup() {
        System.out.println("倒入杯中");
    }

}
