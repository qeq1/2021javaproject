package com.atguigu.poly3;

public class Animal {

    String name = "Animal";
    public void eat(){
        System.out.println("动物吃饭。。。。。");
    }
}

class  Cat extends Animal{
    String name = "Cat";

    @Override
    public void eat() {
        System.out.println("小猫吃鱼 很开心。。。。");
    }
    public void catchMouse(){
        System.out.println("小猫抓老鼠 。。。。。。");
    }
}

class Dog extends Animal{
    String name = "Dog";
    @Override
    public void eat() {
        System.out.println("小狗吃肉 很开心。。。。。");
    }
    public void lookHome(){
        System.out.println("旺财 看家。。。。。");
    }
}
