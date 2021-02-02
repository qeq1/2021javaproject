package com.atguigu.abstract3;

public abstract class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class  Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("小狗  吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("小狗  睡觉");
    }
}

 abstract class Cat extends Animal{

    //abstract void catchMouse();
 }

 class SmallCat extends Cat{

     @Override
     public void eat() {

     }

     @Override
     public void sleep() {

     }

 }