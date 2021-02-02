package com.atguigu.polytest2;

public class Employee {

    String name;

    MyDate myDate;

    public Employee(String name, MyDate myDate) {
        this.name = name;
        this.myDate = myDate;
    }

    public Employee() {
    }
    public Employee(String name) {
        this.name = name;
    }

    public double earning(){
        return 0.0;
    }

    public String getInfo(){

        return "姓名："+name+" 实发工资是 "+earning();
    }

}

class MyDate{

    int year;
    int month;
    int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}