package com.atguigu.oop2.ooptest3;
/*
声明一个银行账户类，有属性：利率、账号、余额

​	在测试类的main中，创建账户类的两个对象，其中所有账户 的利率是相同的，
都是0.035，而账号和余额是不同的，并打印显示
 */
public class Test {

    public static void main(String[] args) {

        //创建对象
        Account a1 = new Account();
        //给账户赋值
        a1.account="10102302103021";
        //给余额赋值
        a1.balance=200202002022.22;
        System.out.println("账户是："+a1.account+"，余额是："+a1.balance+"，利率是"+Account.rate);//通过类名.属性名访问 类变量
        //修改利率
        Account.rate=0.05;
        Account a2 = new Account();
        a2.balance=100000000.99;
        a2.account="1010101010101011";
        System.out.println("账户是："+a2.account+"，余额是："+a2.balance+"，利率是"+Account.rate);
    }
}
