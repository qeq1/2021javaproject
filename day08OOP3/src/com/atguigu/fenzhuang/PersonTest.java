package com.atguigu.fenzhuang;


public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(20);
        System.out.println(p1.getAge());
        p1.setSex("男");

        System.out.println("p1.getSex() = " + p1.getSex());


    }
}
