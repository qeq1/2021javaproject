package com.atguigu.command;
/*
命令行参数
run --> eidt configurations --> main class 是自己运行的那个类  --> program arguments
dos java Test  值1 值2 。。。
 */
public class Test {

    public static void main(String[] args) {//jvm

        if(args[0].equals("aa")){
            show(10, 20);
        }else{
            System.out.println("自毁");
        }

       // System.out.println(args[0]);

    }

    public static void show(int n111,int m2221){


    }
}
