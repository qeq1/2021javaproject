package com.atguigu.fenzhuang;

import java.time.Period;

/*
权限修饰符
public  公共的
default 什么都不写
protected 受保护的
private 私有的

注意：
    外部类 只能由 public 和 default修饰

 */
class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.color="黑色";

        dog.nickName="小强";

        dog.sex='公';

        dog.sex='9';


        Person person = new Person();




    }
}
