package com.atguigu.review;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

public class TestReview {


    @Test
    public void test01(){


        BigDecimal b1 = new BigDecimal("10.00");

        BigDecimal b2 = new BigDecimal("3.0");


        System.out.println("b1.divide(b2) = " + b1.divide(b2,BigDecimal.ROUND_FLOOR));

        System.out.println("b1.divide(b2, 20, BigDecimal.ROUND_FLOOR) = " + b1.divide(b2, 20, BigDecimal.ROUND_FLOOR));


    }

    @Test
    public void test02(){
        Date  date = new Date();
        System.out.println(date);
        System.out.println(date.toLocaleString());
    }
    @Test
    public void test03(){
        String a ;
        System.out.print("9999");
    }

    @Test
    public void test04(){

    }

}
