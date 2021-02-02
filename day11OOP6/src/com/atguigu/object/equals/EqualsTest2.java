package com.atguigu.object.equals;
/*
NullPointerException：
   以后遇到最多最简单的异常：
            1.对象空
            2.参数空
注意：
    使用自己确定的值调用方法 防止出现 NullPointerException；
 */
public class EqualsTest2 {
    public static void main(String[] args) {

        Student s1 = new Student(10, 1.7, "张三");
        Student s2 = new Student(10, 1.7, "张三");

        boolean flag = s1.equals(s2);
        System.out.println(flag);


        String s3 = null;

        System.out.println(s1.equals(s3));


     //   System.out.println(s3.equals(s1));

        String mess  ="你好";

        String nn = null;
        System.out.println("====>"+mess.equals(nn));
        System.out.println("====>"+nn.equals(mess));

    }
}
