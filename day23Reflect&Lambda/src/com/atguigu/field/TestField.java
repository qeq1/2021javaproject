package com.atguigu.field;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestField {

    @Test
    public void test01() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.field.Person");

        //2.获取对应的属性
        /*Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
*/
        Field sex = clazz.getField("sex");
        //3.创建对象
        Object o = clazz.newInstance();
        //4.获取属性值
        Object o1 = sex.get(o);
        System.out.println(o1);
    }


    @Test
    public void test02() throws Exception {
        //静态变量 可以不用创建对象 直接使用

        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.field.Person");
        //2.获取属性
        Field country = clazz.getField("country");


        //4.获取属性值
        Object o1 = country.get(null);
        //5.输出属性值
        System.out.println(o1);


    }

    @Test
    public void test03() throws Exception{
        //1.获取Class对象
        Class clazz = Class.forName("com.atguigu.field.Person");
        //2.获取私有的属性
        Field name = clazz.getDeclaredField("name");
        //设置私有属性可见
        name.setAccessible(true);
        //3.创建对象
        Object instance = clazz.newInstance();

        //3.1 修改 属性值
        name.set(instance, "范冰冰");

        //4.获取属性值
        Object value = name.get(instance);
        System.out.println(value);


    }
}

class Person{

    public static String country = "China";

    private String name = "李白";
    double height = 1.78;
    public String sex = "男";


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                '}';
    }
}