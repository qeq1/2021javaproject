package com.atguigu.method.methodtest5;

import java.sql.SQLOutput;

/*
（1）包含属性：长、宽

（2）包含3个方法：
​	求面积、
​	求周长、
​	返回矩形对象的信息：长：xx，宽：xx，面积：xx，周长：xx
 */
public class Rectangle {

    public int length;//长
    int width;

    public int zhouChang() {
        return 2 * (length + width);
    }

    public int getArea() {
        return length * width;
    }

    public void infor(){


        int area = getArea();

        int zhouChang = zhouChang();

        System.out.println("长："+length+",宽："+width+"面积："+area+"，周长："+zhouChang);

    }


}
