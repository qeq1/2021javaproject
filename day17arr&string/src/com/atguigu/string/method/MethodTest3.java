package com.atguigu.string.method;

import org.junit.Test;

public class MethodTest3 {

    @Test
    public void test01(){
        String mess = "ABCEDF";
        /*
        判断是否以指定的内容开头
         */
        boolean ab = mess.startsWith("1AB");
        System.out.println(ab);
        boolean df = mess.endsWith("DF");
        System.out.println("df = " + df);
    }
}
