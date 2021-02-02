package com.atguigu.init;
/*
类的成员：成员变量 成员方法  构造器 代码块
成员代码块：用于给成员你变量赋值
          每创建一个对象 就会执行一次
          早于构造器执行
          安照代码块的书写顺序执行

 */
public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("-------------------------------");
        Person p1 = new Person();
    }
}
