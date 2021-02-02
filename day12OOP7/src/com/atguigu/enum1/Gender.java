package com.atguigu.enum1;
/*
只能表示两种性别：男 女
ctrl + shift +u  大小写切换

1.5之前  构造器私有
     属性变为常量

 */
public class Gender {

    public static final Gender MAN = new Gender("男");
    public static final Gender WOMAN = new Gender("女");

    private String info;

    private Gender(String info) {
        this.info = info;
    }

    private Gender() {
    }

    @Override
    public String toString() {
        return "Gender{" +
                "info='" + info + '\'' +
                '}';
    }
}
