package com.atguigu.abstracttest1;

//
public abstract class Graphic {

    /**
     * 求面积的方法
     */
    public abstract void getArea();
}

class Circle extends Graphic {

    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void getArea() {

        System.out.println("圆的面积是:"+Math.PI * r * r);

    }
}

class Rectangle extends Graphic{

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public void getArea() {
        System.out.println("矩形的面积是："+length*width);
    }
}