package com.atguigu.jicheng3;

/*
（3）子类矩形Rectange继承Graphic图形
包含属性：length、width
重写求面积getArea()和求周长getPerimeter()方法
 */
public class Rectange extends Graphic {

    int length;
    int width;

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
