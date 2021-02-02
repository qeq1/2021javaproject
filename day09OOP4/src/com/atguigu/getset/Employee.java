package com.atguigu.getset;

/*
声明一个员工类
public void setXxx(参数){
    this.参数名 = 参数名；
}
public 数据类型 getXxx(){
return 参数名;
}
pojo
entity

 */
public class Employee {
    //成员变量 属性
    private String no;
    private char sex;
    private double salary;
    private String name;

    public Employee(){}

    public Employee(String no,char sex,double salary,String name){
        this.no = no;
        this.sex = sex;
        this.salary = salary;
        this.name = name;
    }


    //设置编号
    public void setNo(String no) {
        this.no = no;
    }

    //获取编号
    public String getNo() {
        return no;
    }

    //设置姓名
    public void setName(String name) {
        this.name = name;
    }

    //获取姓名
    public String getName() {
        return name;
    }

    //设置薪水
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //获取薪水
    public double getSalary() {
        return salary;
    }
    //设置性别
    public void setSex(char sex) {
        this.sex = sex;
    }
    public char getSex() {
        return sex;
    }

    public void getinfo(){
        System.out.println("名字是："+name+"性别是："+sex+"编号是："+no+"薪资是"+salary);
    }


}
