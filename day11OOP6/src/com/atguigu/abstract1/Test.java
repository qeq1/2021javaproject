package com.atguigu.abstract1;



/*
Animal 世界上没有一个物种叫动物
       集合了各种动物的特点 方便命名一类事物 所以提出动物的概念


需求：1.动物的对象 不能创建出来
     2.动物类中的方法 也只是给子类提供一个参考  真正运行时  不会执行父类的方法
 */
public class Test {

    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();

        Animal ani = new Animal();
        ani.eat();

    }
}
