package com.atguigu.interfacetest1;

public class Test {
    public static void main(String[] args) {

        LiveAble animal = new Animal();

        animal.eat();
        animal.breathe();
        animal.sleep();

        LiveAble plant = new Plant();

        plant.eat();
        plant.breathe();

        LiveAble.drink();


    }
}
