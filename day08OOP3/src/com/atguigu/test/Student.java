package com.atguigu.test;

public class Student {
    int age;
    String name;
    static String country;

    public void show() {
        System.out.println("this is show()" + name + country);
    }

    public static void message(){
        System.out.println("this is message"+country );
    }
}
