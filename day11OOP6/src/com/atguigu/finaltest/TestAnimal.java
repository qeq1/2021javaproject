package com.atguigu.finaltest;

/*
final： 修饰类时 此类 不能被继承（太监）
         public final class Animal {}

        final修饰的方法 子类不能重写
         public final void eat(){}

        final修饰的【变量：不仅有成员变量 也有局部变量】是常量 固定不变的量  不能修改

        final修饰的对象地址值不能改变



 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name);
        //  animal.name = "旺财";
        System.out.println(animal.name);
        final int num = 20;
        System.out.println(num);
        //num = 40;
        System.out.println(num);


        final Dog dog = new Dog(2, "黄色");
        System.out.println(dog.age + " : " + dog.color);
        dog.color = "白色";
        dog.age = 4;
        System.out.println(dog.age + " : " + dog.color);
      //  dog = new Dog(5, "黑色");


    }
}
