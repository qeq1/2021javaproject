package com.atguigu.jicheng3;

/*
（1）父类Graphic图形
包含属性：name（图形名），属性私有化，不提供无参构造，只提供有参构造
包含求面积getArea()：返回0.0
求周长getPerimeter()方法：返回0.0
显示信息getInfo()方法：返回图形名称、面积、周长

（2）子类Circle圆继承Graphic图形
包含属性：radius
重写求面积getArea()和求周长getPerimeter()方法，显示信息getInfo()加半径信息

（3）子类矩形Rectange继承Graphic图形
包含属性：length、width
重写求面积getArea()和求周长getPerimeter()方法
 */
public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(6.0);
        String info = circle.getInfo();
        System.out.println(info);
        Rectange rectange = new Rectange();
        rectange.setName("矩形");
        rectange.width = 10;
        rectange.length=20;
        System.out.println("-------------------------------------");
        String info1 = rectange.getInfo();

        System.out.println(info1);


    }

}
