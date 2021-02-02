package com.atguigu.interface1;

public class SuperMan implements Fly {
    @Override
    public void fly() {
        System.out.println("超人 爱飞  拯救地球");
    }

}

class Bird implements Fly{
    @Override
    public void fly() {
        System.out.println("小鸟飞");
    }
}
