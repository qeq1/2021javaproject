package com.atguigu.reflect;
/*

类在内存中： 加载 使用 卸载

类的加载：
一 加载： 将 class加载到内存中

二 连接
    ①验证
         校验合法性/正确性 版本对不对
         cafe baby 0101010101010
    ②准备 准备对用的方法区 创建 Class对象  给 类变量赋默认值,以及给静态常量赋初始值

    ③解析 把字节码中的符号引用替换为对应的直接地址引用
          可以提高资源查找的速度

三.类的初始化<clinit>


四.类的初始化可能会滞后
   即使 类没有完成初始化 也能够去使用部分资源





 */
public class TestReflect {


}

class Person{
    int age;
    String name;


    public void show(){

        System.out.println(name.toUpperCase());

        //0x1122
    }

}
