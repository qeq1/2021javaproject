package com.atguigu.reflect.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassTest2 {

    public static void main(String[] args) throws ClassNotFoundException {
        /*
           public static final int PUBLIC           = 0x00000001;
           public static final int PRIVATE          = 0x00000002;
         */

        Class clazz = Class.forName("com.atguigu.reflect.clazz.Cat");
        //获取当前类中的属性
       // Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            // 2  0  1
            System.out.println(Modifier.toString(field.getModifiers()) + "---->" + field.getName());
        }

        System.out.println("----------------------------------------------------------------");
        //Method[] declaredMethods = clazz.getDeclaredMethods();  //只能获取本类中的 方法 私有
        //不仅可以获取本类中 public的 方法 也会拿到 父类中public的方法
        Method[] declaredMethods = clazz.getMethods();
        for (Method method : declaredMethods) {

            System.out.println(method);
        }
        System.out.println("-----------------------==========----------------------------");

       // Constructor[] constructors = clazz.getConstructors();

        Constructor[] constructors = clazz.getDeclaredConstructors();//拿到所有的构造器

        for (Constructor c : constructors) {
            System.out.println(c);
        }
        System.out.println("-----------------------==========----------------------------");

        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
        System.out.println("-----------------------==========----------------------------");

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

    }
}

class Cat implements Comparable{

    private String name;
    double height;
    public String color;

    private void show() {

        System.out.println("this is show()");
    }

    private Cat(String color) {
        this.color = color;
    }

    public Cat(String name, double height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
