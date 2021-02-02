package com.atguigu.wrapper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*

@Before : 在执行测试方法前 执行的方法


@After: 在执行方法后 执行的方法


 */
public class Test9 {
    @Test
    public void cc() {
        System.out.println("7777777");
    }
    @Test
    public void aa(){
        System.out.println("66666666");
    }

    @Before
    public void mm(){

        System.out.println("this is mm()");
    }

    @After
    public void kk(){
        System.out.println("this is kk()");
    }
}
