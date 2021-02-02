package com.atguigu.objectinit;

public class Father {
    int age = getNum();
    private int getNum() {
        System.out.println("Father this is getAge");
        return 10;
    }
    public Father(int age){
        System.out.println("Father(int age)");
        this.age = age;
    }
    {
        System.out.println("father1");
    }
    int num = getNum();

    Father() {
        System.out.println("Father 无参构造器");
    }
}

class Son extends Father{
    {
        System.out.println("son1()");
    }
    double height=getHeight();

    private double getHeight() {
        System.out.println("son getHeight()");
        return 3.9;
    }
    public Son(){
        super();
        System.out.println("Son无参");
    }


}
