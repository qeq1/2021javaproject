package com.atguigu.interface3;
/*
当出现同名的方法  则 必须进行重写 否则报错

还可以在重写的方法内
    接口名.super.方法名（）；
    Study.super.study();
 */
public class Person implements Study,HardStudy {
    @Override
    public void study() {
        //System.out.println("我要好好学习");
        Study.super.study();
    }

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.study();

    }
}
