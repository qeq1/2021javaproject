package com.atguigu.interface2;

public class Plane implements Fly{
    @Override
    public void fly() {
        System.out.println("飞起来 飞机");
    }

   /* @Override
    public void addOil() {
        System.out.println("飞机加 航空煤油");
    }*/
}
