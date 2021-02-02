package com.atguigu.jicheng3;

/*
（2）子类Circle圆继承Graphic图形
包含属性：radius
重写求面积getArea()和求周长getPerimeter()方法，显示信息getInfo()加半径信息
 */
public class Circle extends Graphic {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public String getInfo() {
        return "半径是：" + radius + "面积是：" + getArea() + "周长是：" + getPerimeter();
    }
}
