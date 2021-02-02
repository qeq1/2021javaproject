package com.atguigu.instance;

import java.util.Calendar;

/*

instanceof: 判断左边的对象是否是属于右边类型



 */
public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Cat cat = new Cat();
        System.out.println(animal instanceof Animal);
        System.out.println(cat instanceof Cat);

        System.out.println(animal instanceof Object);

        System.out.println(cat instanceof Animal);
        String ss = "你好";
        System.out.println(ss instanceof Object);
        System.out.println("-----------------------------------------------");
       // System.out.println(ss instanceof  Animal);
        Dog dog = new Dog();
        System.out.println(dog instanceof Animal);




    }
}
