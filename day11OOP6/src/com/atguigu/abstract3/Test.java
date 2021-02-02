package com.atguigu.abstract3;
/*
1.如何定义抽象类？
  [权限修饰符] abstract class 类名
2.如何定义抽象方法？
  [权限修饰符] abstract 返回值类型  方法名(形参);
3.抽象类不能创建对象 所有的功能都需要子类去实现

  抽象类 一组功能的集合 如果是我的孩子 则 必须有这些功能


4.如果一个类继承了一个抽象类 那么 此类 必须实现 父类中所有的抽象方法

  或者此类也变为抽象类


5.抽象用于表示 is a的关系
   Cat is a Animal
   Dog is a Animal

6. 抽象类中可以没有抽象方法 可以存在普通的资源 普通变量 普通的方法

   抽象方法必须存在于抽象类中


7.Servlet

 */
public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "阿黄";

        dog.age = 19;

        System.out.println(dog);

        System.out.println("------------------------------------");



        Dog dog1 = new Dog("旺财", 3);

        System.out.println(dog1);
    }
}
