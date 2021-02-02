package com.atguigu.abstract1;

public class Animal {

    public void eat(){

    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("小狗吃肉");
    }
}
