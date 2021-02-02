package com.atguigu.string.method;

import com.atguigu.string.TestString1;
import org.junit.Test;

import java.util.Arrays;

public class MethodTest5 {

    @Test
    public void test01() {

        String mess = "ABCD";
        /*
        replace("指定的字符串","要替换的内容")
        如果查找的字符串不存在的  那么 返回 原字符串
         */

        String ab = mess.replace("FR", "6666");

        System.out.println(ab);

    }

    @Test
    public void test02() {
        String str = "hello244world.java;887";
        String s = str.replaceAll("[^a-zA-Z]+", "");
        System.out.println(s);

    }

    @Test
    public void test03() {


        String ss = "a1b1c";

        //按照指定的要求 进行切割
        String[] split = ss.split("1");
        System.out.println(Arrays.toString(split));

        String mess  ="AB1CD3jk8op";

        String[] split1 = mess.split("\\d");

        System.out.println("Arrays.toString(split1) = " + Arrays.toString(split1));
    }

    @Test
    public void test04() {

        String mess  ="1AB1CD32jk8op2";
        //"^\\d|\\d$"  以数字开头 或者 以数字结尾
        String s = mess.replaceAll("^\\d|\\d$", "");

        System.out.println(s);

        String[] split = s.split("\\d+");

        System.out.println(Arrays.toString(split));


    }
}
