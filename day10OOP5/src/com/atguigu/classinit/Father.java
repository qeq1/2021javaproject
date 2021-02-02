package com.atguigu.classinit;

public class Father {
    static {
        System.out.println("Father(1)");
    }
    public static int age = getNum();
    private static int getNum() {
        System.out.println("Father this is getNum()");
        return 10;
    }
    public static int num = getNum();

    static {
        System.out.println("Father(2)");
    }
    public static void show(){
        System.out.println("Father this is show()");
    }
}
class Son extends Father{

    public static void show(){
        System.out.println("Son this is show()");
    }
    public static int n1 = getNum1111();
    private static int getNum1111() {
        System.out.println("son this is getNum1111");
        return 20;
    }
    static {
        System.out.println(" son(1)");
    }
    public static int n2 = getNum1111();
    static {
        System.out.println(" son(2)");
    }

}
