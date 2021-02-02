package com.atguigu.object.getclass;

import sun.font.EAttribute;

public class Animal {

    public void eat(){
        System.out.println("吃东西");
    }
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("小狗吃肉 哈哈哈.........");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("小猫吃鱼 哈哈哈.......");
    }
}