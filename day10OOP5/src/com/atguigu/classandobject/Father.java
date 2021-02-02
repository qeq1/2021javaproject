package com.atguigu.classandobject;


public class Father {

    public static int num  = getNum();
    public int age = getAge();

    public int getAge() {
        System.out.println("Father this is getAge()");
        return 20;
    }

    private static int getNum() {
        System.out.println("static Father getNum() ");
        return 10;
    }
    static {
        System.out.println("static Father(1)");
    }

    {
        System.out.println("Father(1)");
    }
   public Father(){
       System.out.println("Father 无参");
    }
}

class Son extends Father{

    public static double height = getHeight();

    public int num = getAge();

    @Override
    public int getAge() {
        System.out.println("son 重写 getAge()");
        return 90;
    }

    private static double getHeight() {
        System.out.println("static Son() this is getHeight()");
        return 1.87;
    }

    static {
        System.out.println("staic son(1)");
    }

    {
        System.out.println("son（1）");
    }

    public Son(){
        super();
        System.out.println("son 无参构造器");
    }
}
