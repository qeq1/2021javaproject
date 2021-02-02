package com.atguigu.polytest2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //准备数据
        Employee[] es = new Employee[5];

        //2正式工

        SalaryEmployee s1 = new SalaryEmployee("赵四", new MyDate(2010, 2, 1), 1000, 20, 2);
        SalaryEmployee s2 = new SalaryEmployee("刘能", new MyDate(2010, 3, 1), 10000, 20, 2);
        //2临时
        HourEmployee h1 = new HourEmployee("大脚", new MyDate(2009, 1, 1), 10, 10);
        HourEmployee h2 = new HourEmployee("大拿", new MyDate(2009, 2, 2), 10, 9);

        //1 经理
        Manager manager = new Manager("广坤", new MyDate(2002, 2, 2), 20000, 20, 2, 0.5, 1000);
        es[0] = s1;
        es[1] = s2;
        es[2] = h1;
        es[3] = h2;
        es[4] = manager;

        //检索信息

        System.out.println("请输入月份");

        Scanner in = new Scanner(System.in);
        int month = in.nextInt();

        for (Employee e : es) {
            System.out.println(e.getInfo());
            if (e.myDate.month == month) {
                //判断是不是正式员工
                if(e instanceof SalaryEmployee){
                    System.out.println(e.name+",生日快乐 因为有你XXX公司更精彩");
                }

            }
            if(e instanceof HourEmployee){
                HourEmployee hourEmployee = (HourEmployee)e;
                hourEmployee.leave();
            }

        }


    }
}
