package com.atguigu.jicheng;

/*
声明一个动物类

用于存储 各种动物相同的信息
 */
public class Animal {
    String name = "Animal";
    int age = 88;

    public void setName(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "在吃饭，年龄是：" + this.age);
    }
}
