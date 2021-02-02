package com.atguigu.ann;

import org.junit.Test;

import java.lang.annotation.Annotation;

public class TestAnn {
    @Test
    public void test01() throws ClassNotFoundException {
        //获取Class对象

        Class clazz = Class.forName("com.atguigu.ann.Person");
        //获取所有的注解
       /* Annotation[] annotations = clazz.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }*/

        Annotation annotation = clazz.getAnnotation(MyAnn.class);
        System.out.println(annotation);
    }
}
