package com.atguigu.poly1;

public class Animal {

    String name;

    void showInfo() {
        System.out.println("名字你是" + name);
    }

    public void eat(){
        System.out.println("动物吃饭。。。。。");
    }

}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("小猫吃饭。。。。。");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("小狗吃饭。。。。。。");
    }
}