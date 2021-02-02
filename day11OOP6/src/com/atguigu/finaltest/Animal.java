package com.atguigu.finaltest;

public  class Animal {

   final String name = "Animal";


    public  void eat(){
        System.out.println("吃饭。。。。。");
    }

}

class Dog extends Animal{

    int age;
    String color;

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("小狗吃肉 很开心。。。。");
    }
}
