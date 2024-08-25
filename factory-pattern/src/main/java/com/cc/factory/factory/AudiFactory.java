package com.cc.factory.factory;

import com.cc.factory.Audi;
import com.cc.factory.Car;

public class AudiFactory implements CarFactory{

    @Override
    public Car facture() {
        return new Audi();
    }
}
