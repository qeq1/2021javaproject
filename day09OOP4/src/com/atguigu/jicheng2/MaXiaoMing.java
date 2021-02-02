package com.atguigu.jicheng2;

public class MaXiaoMing extends Person {


    public void eat() {
        System.out.println("吃肯德基。。。。。。");
    }

    void walk() {
        System.out.println("骑自行车上班。。。。。");
    }

    @Override
    public MaXiaoMing getSum(Person d1) {

        return new MaXiaoMing();

    }
}
