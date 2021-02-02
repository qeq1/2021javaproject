package com.atuigu.api.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.acl.LastOwnerException;
import java.util.Random;

public class BigTest {

    @Test
    public void test01() {
        /*
          BigInteger 大的整数
            存储大的整数
         */
        //9223372036854775807
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        long l = 9223372036854775807L;

        BigInteger b1 = new BigInteger("90");
        System.out.println(b1);

        int a = 10;

        int b = 20;

        System.out.println(a + b);
        BigInteger b2 = new BigInteger("20");

        // System.out.println(b1+b2);


        System.out.println("加法 b1.add(b2) = " + b1.add(b2));

        System.out.println("减法 b1.subtract(b2) = " + b1.subtract(b2));

        System.out.println("乘法 b1.multiply(b2) = " + b1.multiply(b2));

        System.out.println("除法 b1.divide(b2) = " + b1.divide(b2));

        System.out.println("余数 b1.remainder(b2) = " + b1.remainder(b2));


    }

    @Test
    public void test02() {
        /*
        BigDecimal :用于存储确切的小数
         */
        BigDecimal b1 = new BigDecimal("10");

        BigDecimal b2 = new BigDecimal("5");

        System.out.println("b1.add(b2) = " + b1.add(b2));

        System.out.println("b1.divide(b2 ) = " + b1.divide(b2));

        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));

        System.out.println("b1.subtract(b2) = " + b1.subtract(b2));

        System.out.println("b1.remainder(b2) = " + b1.remainder(b2));


        double d1 = 10.0;
        double d2 = 3;
        System.out.println(d1 / d2);
    }


    @Test
    public void test03() {

        BigDecimal b1 = new BigDecimal("10.00");

        BigDecimal b2 = new BigDecimal("3.0");


        //   System.out.println("b1.divide(b2) = " + b1.divide(b2, BigDecimal.ROUND_CEILING));
        // 20 代表保留多少位小数
        System.out.println("b1.divide(b2) = " + b1.divide(b2, 20, BigDecimal.ROUND_CEILING));
    }


    @Test
    public void test04() {
/*

random.nextInt(n)
[0,n) 范围内的int类型的随机数
当种子固定的时候 产生的随机数是相同的

 */
        Random random = new Random(1);

        for (int i = 0; i < 10; i++) {
            //   System.out.println(random.nextDouble());
            //System.out.println(random.nextBoolean());
            //5 == 8 == 7 == 3 == 4 == 4 == 4 == 6 == 8 == 8
            // 5 == 8 == 7 == 3 == 4 == 4 == 4 == 6 == 8 == 8 ==
            System.out.print(random.nextInt(10) + " == ");

        }


    }
}
