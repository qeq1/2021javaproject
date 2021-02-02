package com.atguigu.lambda.inter;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Testlambda {


    @Test
    public void test01() {
/*

供给型接口 雷锋

 */
        Supplier<String> s = new Supplier<String>() {
            @Override
            public String get() {
                return "你好";
            }
        };
        System.out.println(s.get());
        //当没有形参的时候 不能省略
        Supplier<String> s1 = () -> "你好啊";

        System.out.println(s1.get());

    }

    @Test
    public void test02() {

       /* Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).forEach((a)->System.out.println(a));*/

        Stream.generate(() -> Math.random()).forEach((a) -> System.out.println(a));

    }

    @Test
    public void test03() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "李白");
        map.put(11, "杜甫");
        map.put(12, "王安石");
        map.put(13, "李商隐");

      /*  map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) {
                if(s.startsWith("李")){
                    return "啦啦啦";
                }
                return null;
            }
        });*/
        map.replaceAll((a, b) -> {

            if (b.startsWith("李")) {
                return "啦啦啦";
            }
            return null;
        });
        System.out.println(map);
    }


    @Test
    public void test04() {

        ArrayList<String> list = new ArrayList<>();

        list.add("李白");
        list.add("杜甫");
        list.add("白居易");
        list.add("李商隐");


     /*   list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.startsWith("李")){
                    return true;
                }
                return false;
            }
        });*/

/*
     list.removeIf(s->{
         if(s.startsWith("李")){
             return true;
         }
         return false;\[]]]]]]
     });
*/
      //  list.removeIf(s -> s.startsWith("李") ? true : false);
        list.removeIf(s ->  s.startsWith("李"));
        System.out.println(list);
    }

    @Test
    public void test05() {
        /*
         * 所有员工对象
         * 所有年龄超过35的员工
         * 所有薪资高于15000的女员工
         * 所有编号是偶数的员工
         * 名字是“张三”的员工
         * 年龄超过25，薪资低于10000的男员工
         */
        EmployeeSerice serice = new EmployeeSerice();

       /* ArrayList<Employee> employees = serice.get(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return true;
            }
        });*/
        // ArrayList<Employee> employees =serice.get((e)->{return true;});
        //  ArrayList<Employee> employees =serice.get(e-> true);
        ArrayList<Employee> employees = serice.get(e -> e.getAge() > 35);
        employees.forEach((t) -> System.out.println(t));


    }
}

class EmployeeSerice {


    ArrayList<Employee> all;

    public EmployeeSerice() {
        all = new ArrayList<>();
        all.add(new Employee(1, "蔡旭坤", "男", 18, 888888));
        all.add(new Employee(2, "李冰冰", "女", 20, 1111));
        all.add(new Employee(3, "迪丽热巴", "女", 29, 66666));
        all.add(new Employee(4, "金服", "男", 40, 77777));
    }

    ArrayList<Employee> get(Predicate<Employee> p) {
        //创建新的集合 存储满足要求的员工
        ArrayList<Employee> newArr = new ArrayList<>();

        for (Employee e : all) {

            if (p.test(e)) {//如果满足要求 放到集合内
                newArr.add(e);
            }
        }
        return newArr;
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