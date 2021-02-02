package com.atguigu.classinit;

/*
类的初始化：
类的初始化目的：给静态成员变量赋值
jvm调用<clinit>方法完成

class initialization
类的初始化 只会执行一次
先去初始化 父类的资源 再去初始化 子类的资源
 */
public class Test {
    public static void main(String[] args) {
       /* Father.show();
        System.out.println("--------------------------");
         Father.show();*/
        Son.show();
        System.out.println("--------------------------");
        Son.show();
    }

}
