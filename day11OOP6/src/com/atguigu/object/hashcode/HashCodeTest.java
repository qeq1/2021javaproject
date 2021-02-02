package com.atguigu.object.hashcode;


/*
hashCode:用于返回当前对象的hash码
 ①如果两个对象的hash值是不同的，那么这两个对象一定不相等；

 ②如果两个对象的hash值是相同的，那么这两个对象不一定相等。

涉及以后 哈西表
        顺序表+链表


尽量 让不同的对象 产生的hash码是不一样的

重写hashCode();



 */
public class HashCodeTest {
    public static void main(String[] args) {
        Student s1 = new Student(10, 3.14);
        Student s2 = new Student(10, 3.14);
//com.atguigu.object.hashcode.Student@11e29cdd
        System.out.println(s2);
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("Aa".hashCode());//2112
        System.out.println("BB".hashCode());//2112
    }
}

class Student {
    private int age;
    private double height;

    public Student() {
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getAge();
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public Student(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}