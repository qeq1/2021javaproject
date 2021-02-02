package com.atguigu.classandobject;
/*
 类初始化先执行 <clinit>
 实例初始化
 进行实例初始化时 如果子类重写了父类的方法 那么执行的是子类重写的方法
 如果有父类会执行 两次<init> 子类一次 父类一次
 必须要知道的：类初始化先执行 <clinit>  只会执行一次
             实例初始化后执行    每创建一次对象就会执行一次
 */
public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("------------------------------");
        Son son1 = new Son();
    }
}
