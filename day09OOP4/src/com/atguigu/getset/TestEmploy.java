package com.atguigu.getset;

import java.sql.SQLOutput;

/**
 * （1）声明一个员工类，
 * 包含属性：编号、姓名、薪资、性别，要求属性私有化，提供get/set，
 *  提供无参构造器和有参构造器
 *  提供getInfo()
 *
 * （2）在测试类的main中分别用无参构造和有参构造创建员工类对象，调用getInfo
 */
public class TestEmploy {



    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("李白");
        employee.setNo("001");
        employee.setSalary(9999.9);
        employee.setSex('男');
        employee.getinfo();
        System.out.println("------------------------------------------");
        Employee e1 = new Employee("002", '女', 66666.66, "马小云");
        e1.getinfo();

    }
}
