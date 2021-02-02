package com.atguigu.jicheng4;

/*
声明子类：Teacher类，继承Person类
新增属性：salary薪资
属性私有化，get/set
包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男，薪资：10000



 */
public class Teacher extends Person {

    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("薪资是：" + salary);
    }
}
