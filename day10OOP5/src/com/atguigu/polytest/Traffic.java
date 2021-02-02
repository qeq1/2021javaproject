package com.atguigu.polytest;

public class Traffic {

    public void drive() {
        System.out.println("跑起来");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        Traffic[] traffic = {car, bicycle};

        for (int i = 0; i < traffic.length; i++) {

            traffic[i].drive();

        }
    }
}

class Car extends Traffic {
    @Override
    public void drive() {
        System.out.println("小汽车 滴滴滴");
    }
}

class Bicycle extends Traffic {
    @Override
    public void drive() {
        System.out.println("自行车 叮叮叮");
    }
}