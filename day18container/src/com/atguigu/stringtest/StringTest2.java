package com.atguigu.stringtest;

public class StringTest2 {


    public static void main(String[] args) {
        testString();

       // testStringBuffer();

        //testStringBuilder();
        String s1 = "hello";

        String s2 = "world";
        String s5 ="AAA";

        String s3 = s1+s2;
        String s4 = s1 +s5;

    }

    private static void testStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder sbf = new StringBuilder("");
        for(int i = 0;i<100000;i++){
            sbf.append(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("testStringBuilder用时："+(end-start));//14
    }

    private static void testStringBuffer() {
        long start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("");
        for(int i = 0;i<100000;i++){
            sbf.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("testStringBuffer用时："+(end-start));//19
    }

    private static void testString() {


        long start = System.currentTimeMillis();

        String s = "";
        for(int i = 0;i<100000;i++){
            s+=i;
        }
      //  System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println("testString用时："+(end-start));//29234
    }

}
