package com.atguigu.polytest;

public class Test {
    public static void main(String[] args) {
        Employee[] employees =new Employee[5];

        //2 个正式工
        SalaryEmployee s1 = new SalaryEmployee(10000, 20, 2, "蔡旭坤");
        SalaryEmployee s2 = new SalaryEmployee(80000, 20, 2, "刘能");

        //2小时工
        HourEmployee h1 = new HourEmployee("赵四", 10, 3);
        HourEmployee h2 = new HourEmployee("广坤", 20, 30);
        //1经理
        Manager manager = new Manager(20000, 20, 2, "王富贵", 0.9);
        //将员工添加到数组内
        employees[0] = s1;
        employees[1] = s2;
        employees[2] = h1;
        employees[3] = h2;
        employees[4] = manager;
        //遍历数组
        double sum = 0;
        for(Employee ele:employees){
            sum +=ele.earning();
            System.out.println(ele.getName()+":"+ele.earning());
        }
        System.out.println("工资总额："+sum);
    }
}
