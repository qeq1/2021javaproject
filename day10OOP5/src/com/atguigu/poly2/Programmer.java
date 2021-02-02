package com.atguigu.poly2;

public class Programmer {


    public void coding(){
        System.out.println("写代码。。。。。。。");
    }
}

class Chinese extends Programmer{
    @Override
    public void coding() {
        System.out.println("中国程序员写代码");
    }
}
class Indian extends Programmer{

    @Override
    public void coding() {
        System.out.println("印度程序员写代码");
    }
}
class Japan extends Programmer{
    @Override
    public void coding() {
        System.out.println("日本程序员写代码。。。");
    }
}
