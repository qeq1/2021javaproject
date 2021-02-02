package com.atguigu.object.getclass;
/*

getClass： 获取运行时类型

      多态创建的哪一个实际对象
 */
public class Test {

    public static void main(String[] args) {

        Animal ani = new Dog();

        Class aClass = ani.getClass();

        System.out.println(aClass);


        Animal animal = new Cat();

        System.out.println(animal.getClass());

    }
}

