package com.atguigu.review;

import com.atguigu.interface2.Fly;
import com.atguigu.interface2.Plane;

/*
虚方法： 可以重写的方法

非虚方法： 不可以重写的方法  静态方法 独有方法  使用final修饰的方法  构造器


 */
public class Test {

    public static void main(String[] args) {

        Plane plane = new Plane();

        plane.addOil();

        Fly.show();

    }


}
