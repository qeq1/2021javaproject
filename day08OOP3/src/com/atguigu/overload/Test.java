package com.atguigu.overload;
/*
方法重载：
   不同的方法可以使用相同的方法名。
 注意点：
    同一类中  同一方法名 不同的形参列表：数量 顺序 类型


  方法调用时 会根据 不同的数据类型 自动找到最佳匹配的方法

  已经使用过的方法重载： System.out.println();

 */
public class Test {

    public static void main(String[] args) {
        //sum(10, 20);
       // sum(3.14, 20);
        sum(3, 20.8);


        System.out.println(true);

        System.out.println(10);

        System.out.println(3.14);
    }

    public static void sum(int m,int n,int l){
        System.out.println("this is sum() int int int");

    }

    public static void sum(int m,int n){
        System.out.println("this is sum() int int");


    }
    public static void sum(double d1,double d2){
        System.out.println("this is sum() double double");

    }


    public static void sum(double d1,int i1){

        System.out.println("this is sum() double  int");
    }

    public static void sum(int i1,double d1){
        System.out.println("this is sum() int  double");

    }


}
