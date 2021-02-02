package com.atguigu.review;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Person.class;
        Person p = new Person();
        Class aClass1 = p.getClass();
        //通过类的加载器 再去获取Class对象
        Class aClass2 = aClass.getClassLoader().getClass();
        //通过Class类的静态方法forName（类的全路径名）
        Class aClass3 = Class.forName("com.atguigu.review.Person");

    }

}

class Person {


}
