package com.atguigu.reflect.clazz;
/*

客户端向服务端 发送关闭连接请求

服务端 发送确认消息 收到请求

服务端向客户端发送请求 关闭连接

客户端收到 服务端发送的消息 再次 发送确认 收到的信息


 */
import java.util.Date;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<Integer> integerClass = int.class;
        Class<Date> aClass = Date.class;
        Class<Student> aClass1 = Student.class;
        Class<Long> longClass = Long.class;
        System.out.println("--------------------------------------------");
        Class<Person> personClass = Person.class;
        Person p1 = new Person();
        Class aClass2 = p1.getClass();

        Class aClass3 = aClass2.getClassLoader().getClass();
        Class aClass4 = Class.forName("com.atguigu.reflect.clazz.Person");


    }
}

class Person{


}