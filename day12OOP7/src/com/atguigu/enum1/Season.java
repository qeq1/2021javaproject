package com.atguigu.enum1;




public class Season {

    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","烈日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","白雪皑皑");

    private String des;
    private String name;

    private Season(){}
    private Season(String name,String des){
        this.des = des;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Season{" +
                "des='" + des + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
