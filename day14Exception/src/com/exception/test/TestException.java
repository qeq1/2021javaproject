package com.exception.test;

import org.junit.Test;

import java.io.FileInputStream;

/*
异常体系

Throwable 是所有异常的祖师爷
   Error:
       处理不了此异常
       StackOverflowError:栈溢出溢出
       OutOfMemoryError

   Exception: 重点 ******
      程序员能处理的异常
      Exception:分為兩種
      运行时异常： RuntimeException
       代码写完不报错  运行起来才报错

      编译时（检查）异常: checkedException

       写完代码就报错  检查异常


     常见异常：
     ArithmeticException 数学异常
     ArrayIndexOutofboundsException 数组下标越界
     InputMismatchException  输入不匹配异常
     NullpointException   空指针异常
     ClassCastException  类型转换异常
     Exception 总的异常

 */
public class TestException {


    @Test
    public void test04(){

/*

        FileInputStream fileInputStream = new FileInputStream("E:\\201021java\\day00\\课件\\P2（客户信息管理软件）2.1-需求说明\\CMUtility.jav");
*/




    }



    @Test
    public void test03(){


        int [] arr = {10,20,30};

        System.out.println(arr[2]);
        System.out.println(arr[3]);







    }



    @Test
    public void test01(){

getSum(10000);
    }


    @Test
    public void test02(){
        //OutOfMemoryError
        int [] arr = new int[Integer.MAX_VALUE];
    }


    public static int getSum(int num){

        if (num==1){
            return 1;
        }
        return num+getSum(num-1);
    }
}
