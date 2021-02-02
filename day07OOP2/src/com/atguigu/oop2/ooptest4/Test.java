package com.atguigu.oop2.ooptest4;

/*

声明一个MyDate类型，有属性：年，月，日

​声明另一个Employee类型，有属性：姓名（String类型），生日（MyDate类型）

在测试类中的main中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
 */
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "马云";
        //因为Employee 的 MyDate 是自定义类型 需要放入对应的对象
        MyDate myDate = new MyDate();
        myDate.year = 2020;
        myDate.month = 2;
        myDate.day = 2;
        e1.myDate = myDate;
        System.out.println("名字是：" + e1.name + "出生日期是：" + myDate.year +
                "年" + myDate.month + "月" + myDate.day + "日");
        System.out.println("------------------------------------------------------------------------");
        Employee e2 = new Employee();
        e2.name = "马化腾";
        MyDate myDate1 = new MyDate();
        myDate1.year = 2020;
        myDate1.month = 3;
        myDate1.day = 3;
        e2.myDate = myDate1;
        System.out.println("名字是：" + e2.name + "出生日期是：" + e2.myDate.year +
                "年" + e2.myDate.month + "月" + e2.myDate.day + "日");
    }

}

class MyDate {
    public int year;
    public int month;
    public int day;

}

class Employee {
    //有属性：姓名（String类型），生日（MyDate类型）
    public String name;
    //使用自己声明的类型
    public MyDate myDate;

}