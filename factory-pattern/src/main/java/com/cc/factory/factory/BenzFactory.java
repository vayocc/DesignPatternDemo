package com.cc.factory.factory;

import com.cc.factory.Benz;
import com.cc.factory.Car;

public class BenzFactory implements CarFactory{

    @Override
    public Car facture() {
        return new Benz();
    }
}
