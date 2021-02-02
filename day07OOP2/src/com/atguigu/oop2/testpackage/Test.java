package com.atguigu.oop2.testpackage;
/*
使用本包下的资源不需要导包

当 一个类中需要使用同名的两个类 那么 必然会有一个类使用全路径/全类名 导入
 即 包名+ 类名的方式导入
 */
import com.atguigu.oop1.Student;
public class Test {
    public static void main(String[] args) {
        //创建Student对象
        Student s = new Student();
        com.atguigu.oop2.testpackage.Student s1 = new com.atguigu.oop2.testpackage.Student();
    }
}
