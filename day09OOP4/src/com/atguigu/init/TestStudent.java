package com.atguigu.init;
/*
静态代码块：用于给静态变量进行赋值
          静态代码块只会创建一次 再次创建n个对象 也不会再执行
          先于构造器执行
          执行顺序 按照从上到下执行

给成员变量赋值方式：
 1.默认值
 2.直接赋值
 3.代码块赋值
 4.get/set赋值
 5.构造器赋值
    静态变量 不建议采用构造器赋值  他是属于类的 可以使用类名.属性 进行赋值
 */
public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println("-------------------------");
        Student s2 = new Student();
    }
}
