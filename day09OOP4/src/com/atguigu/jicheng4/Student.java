package com.atguigu.jicheng4;

/*
2、声明子类：Student类，继承Person类
新增属性：score成绩
属性私有化，get/set
包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89
 */
public class Student extends Person {

    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void getInfo(){
        //调用了父亲的getInfo()
        super.getInfo();
        System.out.println("成绩是："+score);
    }


}
