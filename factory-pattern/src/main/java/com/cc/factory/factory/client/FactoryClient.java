package com.cc.factory.factory.client;

import com.cc.factory.factory.BenzFactory;
import com.cc.factory.factory.BmwFactory;
import com.cc.factory.factory.CarFactory;

/**
 * 工厂模式
 * 更符合开-闭原则
 * 新增一种产品时，只需要增加相应的具体产品类和相应的工厂子类即可
 */
public class FactoryClient {
    public static void main(String[] args) {
        // 只需要知道那个工厂生产宝马车 ，不用管具体的宝马类 宝马工厂只生产宝马汽车，
        CarFactory bmwFactory = new BmwFactory();
        bmwFactory.facture().show();

        // 只需要知道那个工厂生产奔驰车 ，不用管具体的奔驰类 奔驰工厂只生产奔驰汽车，
        CarFactory benzFactory = new BenzFactory();
        benzFactory.facture().show();

    }


}
