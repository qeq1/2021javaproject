package com.atguigu.method;

import org.junit.Test;

import java.lang.reflect.Method;

/*
反射操作方法

静态的方法  可以不用创建对象直接调用

非静态方法 必须创建对象调用

私有方法 要设置私有方法可见
        method.setAccessible(true);


 */
public class MethodTest {


    @Test
    public void test01() throws Exception {
        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.method.Person");
        //2.获取指定的方法

        Method method = clazz.getDeclaredMethod("show");
        //3.执行方法  静态方法 可以不用传递 对象
        method.invoke( null);

    }

    @Test
    public void test02() throws Exception {
        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.method.Person");
        //2.获取方法
        Method method = clazz.getDeclaredMethod("test", int.class, int.class);
        //3.创建对象
        Object o = clazz.newInstance();
        //4.执行方法
        method.invoke(o, 10,20);


    }

    @Test
    public void test03() throws Exception {
        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.method.Person");

        //2.获取方法名
        Method method = clazz.getDeclaredMethod("showMessage");
        //设置私有方法可见
        method.setAccessible(true);
        //3.创建对象
        Object o = clazz.newInstance();

        //4.执行方法
        method.invoke(o);



    }


}

class Person {

    public static String country = "China";
    private String name = "李白";
    double height = 1.78;
    public String sex = "男";

    private void showMessage() {
        System.out.println("this is private showMessage()");
    }

    public void test(int a, int b) {
        System.out.println("a+b的和是：" + (a + b));
    }

    public static void show() {

        System.out.println("this is show()");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                '}';
    }
}