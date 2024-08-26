package com.cc.factory.abstractfactory.client;

import com.cc.factory.abstractfactory.FactoryBClass;
import com.cc.factory.abstractfactory.FactoryCClass;

/**
 *  //生产工作流程
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {

        FactoryBClass mFactoryb = new FactoryBClass();
        FactoryCClass mFactoryc = new FactoryCClass();
        // b工厂想要奔驰b
        mFactoryb.factureBenzCar().Show();
        //b工厂想要宝马b
        mFactoryb.factureBmwCar().Show();

        // c工厂想要奔驰c
        mFactoryc.factureBenzCar().Show();
        // c工厂想要宝马c
        mFactoryc.factureBmwCar().Show();

    }

}
