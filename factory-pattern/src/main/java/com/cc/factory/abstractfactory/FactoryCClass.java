package com.cc.factory.abstractfactory;

/**
 * 创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
 */
public class FactoryCClass extends  AbstractCarFactory{
    @Override
    public BenzProduct factureBenzCar() {
        return new BenzC();
    }

    @Override
    public BmwProduct factureBmwCar() {
        return new Bmw5();
    }
}
