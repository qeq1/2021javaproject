package com.atguigu.createobject;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/*
使用反射创建对象
好处：
    1.灵活
    2.可以在运行时再去确定要创建对象的类型

坏处：
    难以理解


 */
public class CreateTest {


    @Test
    public void test01() {

        Person p = new Person();
        //  Student s = new Student();

        Scanner in = new Scanner(System.in);

        System.out.println("请输入你要创建对象的全类名");
        //com.atguigu.createobject.Person
        //com.atguigu.createobject.Student

        String mess = in.next();
        if (mess.equals("com.atguigu.createobject.Person")) {
            Person p1 = new Person();
        } else {
            //  Student s1 = new Student();
        }

    }

    @Test
    public void test02() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//使用反射创建对象
        //1.获取对应的Class对象
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要创建对象的全类名");
        String className = in.next();
        Class clazz = Class.forName(className);
        //2.创建对象了 调用了对应类型的无参构造器
        Object o = clazz.newInstance();
        System.out.println(o);
    }

    @Test
    public void test03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//调用有参构造器 完成对 成员的初始化

        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.createobject.Student");

        /*
         Constructor[] c = clazz.getDeclaredConstructors();
        for (Constructor constructor : c) {
            System.out.println(constructor);
        }
        public com.atguigu.createobject.Student()
         public com.atguigu.createobject.Student(java.lang.String)
         */
        //2.获取构造器
        //获取一个参数的构造器  放的是参数的Class
        Constructor constructor = clazz.getConstructor(String.class);
        //3.执行构造器
        Object instance = constructor.newInstance("杜甫");
        //4.输出结果
        System.out.println(instance);
    }

    @Test
    public void test04() throws Exception {
        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.createobject.Student");
        //2.获取构造器
        //NoSuchMethodException: com.atguigu.createobject.Student.<init>(java.lang.String, int)
        //获取的构造器非public 要使用 getDeclaredConstructor
        Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
        //设置私有的构造器可以访问的
        c.setAccessible(true);

        //3.执行构造器
        Object instance = c.newInstance("王安石", 18);

        //4.输出结果

        System.out.println("instance = " + instance);

    }
}

class Student {

    String name = "李白";

    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat {

}

class Dog {

}

class Person {


}
