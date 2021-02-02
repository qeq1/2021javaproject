package com.atguigu.interface1;
/*
接口为了定义规范。
接口用来表示has a 的关系
  飞机 飞的功能
  超人 飞的功能
  麻雀 飞的功能


1.如何声明接口：

 [权限修饰符] interface 接口名{}
2.如何使用接口

  让一类 实现 接口

  class A implements 接口名{}

3.如果一个类 实现了一个接口 那么此类 可以看做此类的孩子
        Fly fly = new SuperMan();
        fly.fly();


 */
public class Test {
    public static void main(String[] args) {

        SuperMan superMan = new SuperMan();

        superMan.fly();

        Bird bird = new Bird();

        bird.fly();


       // Animal ani  = new Dog();

        Fly fly = new SuperMan();

        fly.fly();


    }
}
