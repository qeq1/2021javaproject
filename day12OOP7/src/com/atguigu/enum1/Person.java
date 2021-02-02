package com.atguigu.enum1;

public class Person {

    String name = "张三";
    int age = 18;

    Gender sex = Gender.MAN;

    Season season =Season.SPRING;


    public static void main(String[] args) {

        Gender man = Gender.MAN;
        Gender man1 = Gender.MAN;
        System.out.println(man==man1);
    }

}
