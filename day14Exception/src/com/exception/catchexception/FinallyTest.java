package com.exception.catchexception;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
finally: 最终的
        无论发生还是没有发生异常 不管 异常有还是没有捕获 都会执行
方式一：   try{}catch(异常类型 e){

   }finally{

   最终会执行的代码
   }

方式二：
   try{
   }finally{
   最终会执行的代码；
   }

   java.lang.ArithmeticException

注意：
    1.在程序没有发生异常时 有return 语句 要先执行finally 再执行返回操作

    2. 在catch语句块内 进行return 那么也要先执行 finally 再执行返回操作

    3.如果在finally中存在 return  那么无论前面在那个位置 有return 都会返回
      finally中的return值。

 */
public class FinallyTest {


    @Test
    public void test03() {


        int show = show();

        System.out.println("show = " + show);


    }

    public static int show() {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("请您输入一个数");
            // arr[10];
            int num = in.nextInt();
            int[] arr = {10, 20, 30};
            System.out.println(arr[2]);

            System.out.println(num / 1);
            return 20;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException a) {
            a.printStackTrace();

            return 66;
        } finally {
            System.out.println("finally 语句块");

            return 88;
        }

    }


    @Test
    public void test02() {

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[4]);
        } finally {
            System.out.println("啦啦啦啦");
        }


        System.out.println("Game Over!!");


    }


    @Test
    public void test01() {

        Scanner in = new Scanner(System.in);

        try {
            int[] arr = {10, 20, 30};
            System.out.println("请您输入一个数字");
            int num = in.nextInt();
            //     System.out.println("arr[3] = " + arr[3]);
            System.out.println(num);
        } catch (InputMismatchException i) {
            System.out.println("执行了。。。。。。");
            i.printStackTrace();
        } finally {
            System.out.println("Game Over!!!");
        }
    }
}
