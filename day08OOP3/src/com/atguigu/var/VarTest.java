package com.atguigu.var;
/*
定义到方法中的变量 局部变量

局部变量 只能在当前方法内使用

局部变量在使用前 已经完成初始化操作 否则报错。

局部变量在完成 方法调用后才会 完成初始化操作

局部变量 ：当方法执行完毕 就会弹栈 消失

使用final修饰的变量 值不能在改变

静态变量 成员变量 局部变量

1.代码位置不同

2.内存位置不同

3.生命周期不同

4.是否有默认值

5.作用域（有效范围）不同




 */
public class VarTest {
    public void show(){
        String mess ="Hello";
        System.out.println(mess);
        System.out.println(num);
    }
    int num;
    public void show2(){
        System.out.println(num);
        int n ;
        n = 20;
        System.out.println(n);
        //  System.out.println(mess);
    }
    public static void main(String[] args) {
        VarTest varTest = new VarTest();
        varTest.show();
        varTest.show2();

       final int m  =20;

    //    m = 40;

    }
}
