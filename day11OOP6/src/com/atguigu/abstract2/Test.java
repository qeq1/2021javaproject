package com.atguigu.abstract2;
/*
1.如何定义抽象类？
  [权限修饰符] abstract class 类名
2.如何定义抽象方法？
  [权限修饰符] abstract 返回值类型  方法名(形参);
3.抽象类不能创建对象 所有的功能都需要子类去实现

4.如果一个类继承了一个抽象类 那么 此类 必须实现 父类中所有的抽象方法


5.抽象用于表示 is a的关系
   Cat is a Animal
   Dog is a Animal






 */



public class Test {
    public static void main(String[] args) {

       // Animal ani = new Animal();

        Cat cat = new Cat();

        cat.eat();
        Dog dog = new Dog();

        dog.eat();

    }
}
