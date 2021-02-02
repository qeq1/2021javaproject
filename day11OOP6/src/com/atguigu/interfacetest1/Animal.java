package com.atguigu.interfacetest1;

public class Animal implements LiveAble {
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void breathe() {
        System.out.println("吸入氧气呼出二氧化碳");
    }

    public  void sleep(){

        System.out.println("闭上眼睛睡觉");
    }
}
class Plant implements LiveAble{


    @Override
    public void eat() {
        System.out.println("吸收营养");
    }

    @Override
    public void breathe() {
        System.out.println("吸入二氧化碳 呼出氧气");
    }
}