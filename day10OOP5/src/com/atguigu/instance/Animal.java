package com.atguigu.instance;

public class Animal {
    String name;

    void showInfo() {
        System.out.println("名字你是" + name);
    }

    public void eat() {
        System.out.println("动物吃饭。。。。。");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();

        Dog dog = new Dog();

        showEat(cat);
        showEat(dog);

    }

    public static void showEat(Animal ani) {// Animal ani = cat;

        if (ani instanceof Cat) {
            Cat cat = (Cat) ani;
            cat.catchMouse();
        }

        if (ani instanceof Dog) {
            Dog dog = (Dog) ani;
            dog.lookHome();
        }

    }

}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("小猫吃饭。。。。。");
    }

    public void catchMouse() {

        System.out.println("小猫 抓老鼠");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("小狗吃饭。。。。。。");
    }

    public void lookHome() {

        System.out.println("旺财   看家护院");
    }
}