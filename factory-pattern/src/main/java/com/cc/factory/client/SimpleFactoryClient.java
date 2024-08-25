package com.cc.factory.client;

import com.cc.factory.Audi;
import com.cc.factory.Benz;
import com.cc.factory.Bmw;
import com.cc.factory.Car;

/**
 * 简单工厂模式
 * 简单工厂不是设计模式，更像是一种编程习惯。它把实例化的操作单独放到一个类中，这个类就成为简单工厂类，让简单工厂类来决定应该用哪个具体子类来实例化。
 * 逻辑简单。封装了创建逻辑，将创建和使用解耦。
 * 违背“开放 - 关闭原则” 一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂。
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        String string = "Audi";
        getMyCar(string).show();
    }

    public  static Car getMyCar(String string) {
        if ("Audi".equals(string)){
            return new Audi();
        }
        if ("Benz".equals(string)){
            return new Benz();
        }
        if ("Bmw".equals(string)){
            return new Bmw();
        }
        return null;

    }
}
