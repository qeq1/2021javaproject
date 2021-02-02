package com.atguigu.oop2.ooptest2;

import java.sql.SQLOutput;

/*
1）声明一个圆的图形类，有属性：半径
	在测试类的main中，创建圆的2个对象，为半径属性赋值，并显示两个圆的半径值和面积值
	提示：圆周率为Math.PI
 */
public class Test {
    /*
     System.out.println();
     语句要写在方法内
     */
    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius=6.66;

        double area= c.radius*Math.PI*c.radius;
        System.out.println("面积是："+area);

        //创建对象二
        Circle c2 = new Circle();

        //给半径赋值
        c2.radius=8.88;

        area = c2.radius*c2.radius*Math.PI;

        System.out.println("面积是："+area);

    }


}

class Circle{

    //半径
    public double radius;


}
