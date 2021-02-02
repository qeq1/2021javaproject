package com.atguigu.interface2;

import com.sun.media.sound.SoftTuning;

/*
    接口中的抽象方法 默认被 public abstract 修饰
    接口中的变量 默认被  public static final 修饰


 */
public interface Fly {
    public static final   int NUM = 20;//public static final
    void fly();//public abstract

   // void addOil();

     default void addOil(){
        System.out.println("加油.........");
    }

   static void show(){
        System.out.println("this is show int Fly");
    }
}
