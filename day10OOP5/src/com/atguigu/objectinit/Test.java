package com.atguigu.objectinit;
/*
实例初始化：  给非静态成员变量赋值

先执行对变量显示初始化的代码,才会去执行构造器的内容

1.当调用子类的无参构造器时 因为子类无参构造器的首行 有super() 调用父类无参构造器

  先给父类成员变量进行初始化  进入父类无参构造器  --> 回到子类无参构造器 --》

  执行子类成员变量的初始化 ---》执行子类无参构造器 ---》回到创建对象的位置
 */
public class Test {
    public static void main(String[] args) {
     //   Father father = new Father();
        System.out.println("-----------------------------------");
       // Father f1 = new Father(20);
        Son son = new Son();

    }
}
