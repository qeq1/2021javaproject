package com.exception.test2;

import org.junit.Test;

import java.util.Scanner;
/*

异常的作用：
    及时发生异常 程序也可以执行下去


 */

public class TestException {


    @Test
    public void test01() {
        Scanner in = new Scanner(System.in);

        System.out.println("请您输入一个数字");

        int num = in.nextInt();

        System.out.println("Game Over");
    }

    @Test
    public void test02() {


        Object obj;
        //= new Object();


        int[] arr = {10, 20, 30};

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 异常的类型 异常发生的位置  异常的原因
                 e.printStackTrace();
                 //获取异常信息
                System.out.println("哈哈哈： "+e.getMessage());
        }
        System.out.println("Game Over");
    }
}
