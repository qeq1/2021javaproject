package com.atguigu.interface2;
/*

1. 一个类可以实现多个接口
2.一个类实现接口后 如果不想实现接口中的抽象方法  则 自己必须变为抽象类

3.接口的成员
   全局静态常量  被 public staic fianl修饰
   抽象方法
   默认方法
   静态方法
   以上内容通通默认被public修饰
4.接口可以多继承
    public interface Sleep extends Fly,Eat{}
    如果一个类实现了 继承了多个接口的接口 那么 不仅要实现 此接口的抽象方法 也要实现继承接口的抽象方法

5.一个类可以先继承一个父类 再去实现多个接口   顺序不能改变
    class Dog extends Animal implements Sleep{}

 */

public class Test {

    public static void main(String[] args) {


        Bird bird = new Bird();

        bird.fly();
        bird.eat();

        bird.addOil();

        Plane plane = new Plane();

        plane.addOil();

        Fly.show();
    }
}
