package com.cc.factory.factory;

import com.cc.factory.Bmw;
import com.cc.factory.Car;

public class BmwFactory implements CarFactory{

    @Override
    public Car facture() {
        return new Bmw();
    }
}
