package com.atguigu.jicheng2;

public class Person extends BigFather{
    String name;
    int age;

    public void eat(){
        System.out.println("喝粥。。。。");
    }

     void walk(){
        System.out.println("走路。。。。。");
    }
    /*
    public int getSum(double d1){
        return 20;
    }*/
    public Person getSum(Person d1){
        return new Person();
    }

}
class BigFather extends Object{
    public void show(){
        System.out.println("this is BigFather show()");
    }

}