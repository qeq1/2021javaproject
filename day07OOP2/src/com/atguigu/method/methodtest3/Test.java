package com.atguigu.method.methodtest3;

/*
参数：

  定义方法
  求俩数的和；

形参： 形式参数
    位置： 在方法的声明处
    语法： 类型 标识符
    作用：1.规定方法调用处传递参数的数据类型必须匹配
         2.接收方法调用处传递的参数

实参：实际参数
     位置：方法的调用处
     实参：传值

     实际的值： 常量  变量

 ctrl + / 快速单行注释

 ctrl + shift + / 快速多行注释
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("this is main");
        /*sum(10,20);
        int n = 20;
        int m = 50;
        sum(n, m);
        byte b  =20;
        byte c = 30;
        sum(b, c);*/
        printRectangle(10,15);
    }
    /**
     * 这是一个求和的方法
     * @param num1 第一个数
     * @param num2 第二个数
     */
    public static void sum(int num1,int num2) {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println(num1+num2);
    }

    /**
     * 打印各种矩形
     * @param rows  行数
     * @param cols  列数
     */
    public static void printRectangle(int rows,int cols){

        for(int i = 1;i<=rows;i++){
            for(int j = 1;j<=cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
