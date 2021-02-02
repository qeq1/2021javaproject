package com.atguigu.jicheng;

public class Cat extends Animal {
    int age=66;
    public void catchMouse(){
        System.out.println("抓老鼠。。。。。");
    }
    public void showAge(){
        System.out.println("showAge"+this);
        System.out.println("cat的年龄是："+this.age+",Animal的年龄是："+super.age);
    }

    public void showName(){
        System.out.println("name:    "+super.name);
    }
}
/*
    String name;
    int age;

    public void eat(){
        System.out.println(name+"在吃东西，年龄是："+age);
    }*/
