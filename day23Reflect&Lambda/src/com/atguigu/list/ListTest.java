package com.atguigu.list;

import com.atguigu.ann.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;

public class ListTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);

       // list.add(new Data());
        Class clazz = list.getClass();
        Method addMethod = clazz.getDeclaredMethod("add", Object.class);
        addMethod.invoke(list,new Date());
        addMethod.invoke(list,new Person());
        System.out.println(list);
    }
}
