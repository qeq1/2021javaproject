package com.atuigu.api.system;

import org.junit.Test;

import java.util.Properties;

public class SystemTest {

    @Test
    public void test01(){
        //获取当前时间的毫米数
        long l = System.currentTimeMillis();
        System.out.println(l);

        System.gc();//运行垃圾收集器。

        int []arr = {10,20,30};
        int[]newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, 3);
        for (int i : newArr) {
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        Properties properties = System.getProperties();
        properties.list(System.out);
        String property = System.getProperty("java.version");
        System.out.println("====>"+property);

    }

    @Test
    public void test02(){

        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1==r2);//true
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
        System.out.println("Aa"=="BB");

        System.out.println("r1.totalMemory() = " + r1.totalMemory());
        System.out.println("r1.freeMemory() = " + r1.freeMemory());
    }

    @Test
    public void test03(){
        SystemTest n = new SystemTest();
        System.out.println(n);
    }

}
