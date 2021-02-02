package com.atguigu.supertest;

public class SmallTeacher extends Teacher {

    double score;
    double height;

    public SmallTeacher( double score){
        this.score = score;
    }
    public SmallTeacher( double height, double score){
        this(score);
        this.height = height;
    }

    public SmallTeacher(double height, double score,String name,int age){
        super(name,age);
        this.height = height;
        this.score = score;
    }



    public SmallTeacher(){
        super();
        System.out.println("this is SmallTeacher()");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println( "名字是："+ super.name+"分数是：" + score+",身高是："+height);
    }
}
