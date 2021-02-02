package com.atguigu.review;

import org.junit.Test;

import java.security.spec.ECField;
import java.util.Arrays;

public class TestArraycopy {
    @Test
    public void test01() {

        //数据源
        int[] arr = {10, 20, 30};
        //目的地
        int[] newArr = new int[3];

        System.arraycopy(arr,1,newArr,0,2);
        System.out.println(Arrays.toString(newArr));


    }

    @Test
    public void test02(){
        try{
            int [] arr = {10,20,30};
            System.out.println(arr[1]);
            //强制退出jvm
            System.exit(0);

        }catch (Exception e){

            e.printStackTrace();
        }finally {

            System.out.println("this is finally");
        }
    }
    public int show() throws Exception{
        throw new Exception();
    }
}
