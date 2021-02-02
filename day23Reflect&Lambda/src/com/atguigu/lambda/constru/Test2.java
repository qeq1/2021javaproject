package com.atguigu.lambda.constru;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.function.Function;
import java.util.function.Supplier;

public class Test2 {

    @Test
    public void test01() {


        /*Supplier<Employee> e = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };*/
        Supplier<Employee> e = Employee::new;
        System.out.println(e.get());
    }

    @Test
    public void test02() {
        Function<Integer, int[]> f = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };
        int[] apply = f.apply(20);

        System.out.println(apply.length);

        Function<Integer, int[]> f1 = int[]::new;
        int[] apply1 = f1.apply(10);
        System.out.println(apply1.length);


    }


}

class Employee {
    //编号、姓名、性别，年龄，薪资

    private int no;
    private String name;
    private String sex;

    private int age;

    private double salary;

    public Employee(int no, String name, String sex, int age, double salary) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}