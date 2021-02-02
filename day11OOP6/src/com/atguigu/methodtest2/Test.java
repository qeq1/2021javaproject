package com.atguigu.methodtest2;

import java.net.Socket;

public class Test {

    public static void main(String[] args) {
        //父类的引用指向子类的实例
        MyClass my = new MySub();

        Father father = new Father();
        Son son = new Son();
        Daughter daughter = new Daughter();

      //  my.method(father);//sub--

       // my.method(son);//son
        my.method(daughter);//sub--
    }
}
