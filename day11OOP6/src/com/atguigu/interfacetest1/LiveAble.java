package com.atguigu.interfacetest1;

public interface LiveAble {

    void eat();

    void breathe();

    default void sleep(){
        System.out.println("睡觉");
    }

    static void drink(){
        System.out.println("喝水");
    }
}
