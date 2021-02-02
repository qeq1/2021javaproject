package com.atguigu.innerclass.staticlass;

import org.junit.Test;

import java.io.OutputStream;

/*
内部类：
   把一个类定义另一个类的内部

外部类：内部类外边的类 叫外部类
  外部类只能被 public 与 default修饰

静态内部类：
一.语法结构：

class 外部类名{

 //内部类定义
 [权限修饰符4种] static [final] class 类名{


 }
}
二.作用
  1.可以打破java单继承的限制

  2.在内部类中做更多的功能 为外部类服务

  3.可以资源的隐藏

三.特点：

1.静态内部类可以访问外部类的资源
     静态的属性
     静态的方法

2.外部类能否使用内部类的资源
   如果是静态资源 可以直接通过 内部类名.资源名
   如果是非静态资源  那么 需要通过 内部类的对象.资源名

3.当类中有内部类的时候
   外部类名$内部类名
 */
public class TestStaicClass {

    public static void main(String[] args) {


        Outer.outerMethod2();
       /* Outer o = new Outer();
        o.outerMethod1();*/
       /*//创建内部类的对象
        Outer.Inner inner = new Outer.Inner();
        inner.innerMethod();
        Outer.Inner.innerMethod2();*/
    }
}
