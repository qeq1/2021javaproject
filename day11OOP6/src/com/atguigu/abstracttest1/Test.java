package com.atguigu.abstracttest1;
/*
定义一个几何图形父类Graphic。
所有几何图形都应该具备一个计算面积的方法。但是不同的几何图形计算面积的方式完全不同
 */
public class Test {
    public static void main(String[] args) {


        Graphic c = new Circle(10);

        Rectangle rectangle = new Rectangle(10, 20);
        Graphic[] gs = {c,rectangle};


        for (Graphic g : gs) {
            g.getArea();
        }



    }
}
