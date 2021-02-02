package com.atguigu.polytest;

public class Employee {

   private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double earning(){
        return  0;
    }

    public String getInfo(){
      return "姓名是："+name+"实发工资"+earning();
    }
}
