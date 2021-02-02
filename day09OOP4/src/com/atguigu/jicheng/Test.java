package com.atguigu.jicheng;

/*
1. 使用继承 要借助于关键字 extends

2. 语法结构
    [权限修饰符] 子类 extends 父类{}

3.当子类继承父类后 就可以使用父类的资源
  属性和方法
4. this 代指当前对象
        当前对象是谁 谁调用就是谁
5. super: 代表从父类继承过来的资源
当子类没有此资源而父亲有时  则使用 super 和 this  没有区别
  this:代指当前对象 使用的是从父类继承的资源
  super: 直接使用的是父亲的资源

 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.eat();

        // cat.setName("Tom");
        // cat.showAge();
        // cat.age = 3;
          cat.eat();
        System.out.println(cat);//Cat@4554617c
        cat.showAge();

    /*    System.out.println("-----------------------");

        Dog dog = new Dog();

        dog.age = 4;
        dog.name = "旺财";

        dog.eat();*/
        System.out.println("-----------------------");
        cat.showName();
    }
}
