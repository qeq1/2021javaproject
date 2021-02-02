package com.atguigu.supertest;

public class Teacher {

    String name;
    int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("名字是：" + name + "年龄是：" + age);
    }
}
