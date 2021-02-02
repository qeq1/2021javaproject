package com.atguigu.abstract2;
//抽象类
public abstract class Animal {
    //抽象方法
    public abstract void eat();
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("小狗 吃肉........");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("小猫吃鱼........");
    }
}