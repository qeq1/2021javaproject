package com.atguigu.jicheng3;

public class Graphic {
    private String name;


    public void setName(String name){
        this.name = name;
    }

    public Graphic(){}

    public Graphic(String name) {
        this.name = name;
    }

    /*
    （1）父类Graphic图形
        包含属性：name（图形名），属性私有化，不提供无参构造，只提供有参构造
        包含求面积getArea()：返回0.0
        求周长getPerimeter()方法：返回0.0
        显示信息getInfo()方法：返回图形名称、面积、周长
     */
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public String getInfo() {
        return "名字是：" + name + "周长是：" + getArea() + "面积是：" + getPerimeter();
    }
}
