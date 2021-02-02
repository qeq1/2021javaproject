package com.atguigu.oop2.ooptest1;
/*
JVM内存：

栈：存放局部变量 执行方法也会开辟空间
堆： 用于存放对象 数组 等等 new 出来的部分
方法区：类的信息，变量信息，方法信息 常量信息 。。。。


本地方法栈： 当执行native方法时会 存放局部变量 执行方法也会开辟空间 C/C++
程序计数器：用于存储下一条指令


问题： 每创建一个对象 都会给 country属性 开辟空间
      所有的同学都是来自于中国  所以是可以复用 country属性

解决：  问题
       使用类变量 或者 叫静态变量解决。
       在成员变量前 + static ;
        public static String country;

 */
public class Test {
    public static void main(String[] args) {

        //Student.country = "中国";


        Student s1 = new Student();
        s1.age = 18;
        s1.name = "李白";
        s1.country="中国";


        Student s2 = new Student();
        s2.name="杜甫";
        s2.age = 19;
        s2.country = "中国";
        Student s3 = new Student();
        s3.country="中国";
        s3.age=19;
        s3.name="王维";
    }
}
