package com.cc.factory.abstractfactory;

/**
 *  创建具体产品类（继承抽象产品类）， 定义生产的具体产品；
 */
public class BenzB extends BenzProduct{

    @Override
    public void Show() {
        System.out.println("这里是奔驰b级车");
    }
}
