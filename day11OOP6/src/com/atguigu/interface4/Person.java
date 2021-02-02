package com.atguigu.interface4;

public class Person {

    void eat(){
        System.out.println("吃满汉全席");
    }

}

interface Eat{
    default void eat(){
        System.out.println("吃饺子");
    }

}
