package com.atguigu.interface2;

public class Bird implements Fly,Eat {
    @Override
    public void eat() {
        System.out.println("小鸟吃虫子");
    }

    @Override
    public void fly() {
        System.out.println("小鸟飞的很开心");
    }
}
