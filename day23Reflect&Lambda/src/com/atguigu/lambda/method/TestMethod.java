package com.atguigu.lambda.method;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
简化 lambda表达式
方法引用的语法格式：
（1）实例对象名::实例方法

（2）类名::静态方法

（3）类名::实例方法
 */
public class TestMethod {

    @Test
    public void test01() {

        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("白居易");
        list.add("李商隐");

       /* list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //  list.forEach((s)->System.out.println(s));

        list.forEach(System.out::println);
    }

    @Test
    public void test02() {
        Employee e = new Employee(1, "李白", "男", 13, 8989);
        /*Supplier<String> name = new Supplier<String>() {
            @Override
            public String get() {
                return e.getName();
            }
        };*/
        //Supplier<String> name = () -> e.getName();
        Supplier<String> name = e::getName;

        System.out.println(name.get());


    }

    @Test
    public void test03() {
      /*  Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).forEach(System.out::println);*/

        //Stream.generate(()->Math.random()).forEach(System.out::println);
        Stream.generate(Math::random).forEach(System.out::println);

    }

    @Test
    public void test04(){
        String [] arr = {"h","d","c","z","a"};

        /*Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/
       // Arrays.sort(arr, (o1,o2)->o1.compareTo(o2));
        Arrays.sort(arr, String::compareTo);

        System.out.println(Arrays.toString(arr));

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