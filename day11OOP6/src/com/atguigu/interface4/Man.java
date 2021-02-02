package com.atguigu.interface4;

public class Man extends Person implements Eat {
    @Override
    public void eat() {
        System.out.println("我要自己吃饭");
    }

    public static void main(String[] args) {

        Man man = new Man();

        man.eat();


    }
}
