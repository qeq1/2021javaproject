package com.atguigu.poly1;

class Japan extends Programmer{
    @Override
    public void eat() {
        System.out.println("日本人跪着吃饭。。。。");
    }

    public void play(){
        System.out.println("相扑。。。。。");
    }
}

public class Programmer  {
    public void  eat(){
        System.out.println("程序员吃饭。。。");
    }
}

class Chinese extends Programmer{

    @Override
    public void eat() {
        System.out.println("中国人使用筷子吃饭");
    }
    public void play(){
        System.out.println("中国人玩太极。。。。");
    }
}
class Indian extends Programmer{
    @Override
    public void eat() {
        System.out.println("印度人 使用  手吃饭。。。。");
    }

    public void play(){
        System.out.println("印度人玩 摩托车。。。。。");
    }
}
class English extends Programmer{
    @Override
    public void eat() {
        System.out.println("欧美人 使用刀叉吃饭");
    }
    public void play(){
        System.out.println("欧美人 玩 极限运动");
    }
}