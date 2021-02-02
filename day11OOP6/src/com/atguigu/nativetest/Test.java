package com.atguigu.nativetest;
/*
native: 本地的原生的
栈： 局部变量  方法执行时开辟的空间
堆： 对象 数组 放到此位置
方法区： 类的信息  方法的信息  静态资源  常量池
本地方法栈： 执行本地方法的时候 所开辟的空间
本地方法 native方法：  public native int hashCode(); 没有方法体
                     有些功能 java无法实现  借助于 C/C++ 实现

 */
public class Test {
    public static void main(String[] args) {

        Test test = new Test();

        System.out.println("test.hashCode() = " + test.hashCode());

        Math.pow(2, 3);

    }
}
