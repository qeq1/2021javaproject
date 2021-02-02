package com.atguigu.abstracttest2;

public abstract class Person {

    public abstract void walk();

    public abstract void eat();
}

class Man extends Person{
    @Override
    public void walk() {
        System.out.println("大步流星走路");
    }

    @Override
    public void eat() {
        System.out.println("狼吞虎咽吃饭");

    }
    public void smoke(){
        System.out.println("吞云吐雾.....");
    }
}

class Woman extends Person{


    @Override
    public void walk() {
        System.out.println("婀娜多姿走路");
    }

    @Override
    public void eat() {
        System.out.println("细嚼慢咽吃饭。。。");
    }

    public void buy(){
        System.out.println("买买买.........");
    }
}

