package com.atguigu.thistest;
/*

this: 1.可以用来区分成员变量与局部变量

      2.可以用来调用本类中的构造器 根据数据类型进行匹配 不是根据变量名
        调用本类构造器必须位于首行
        一般多参调少参
     3.this可以调用 成员方法
       一般在本类中是可以省略this
 */
public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person("李白", 28, 9999.9, 1.89);

       // person.getInfo();

        person.show();

    }
}
