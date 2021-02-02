package com.atguigu.object.toString;

/*
问题： 输出对象属性信息时 如果对象的属性很多 写起来很麻烦

解决： toString();

注意：
    如果输出对象名  则 会自动调用toString();
    com.atguigu.object.toString.Person@4554617c

    不想看 相关地址信息  想看属性信息
     重写toString();



 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person("李白", 18, 1.89);

        String info = p1.getInfo();
        System.out.println("info = " + info);

        System.out.println("----------------------------------------");
        String s = p1.toString();
        //com.atguigu.object.toString.Person@4554617c
        System.out.println("s = " + s);
        System.out.println("p1 = " + p1);
        System.out.println("----------------------------------------");

        Person p2 = new Person("杜甫", 20, 1.98);

        System.out.println("p2 = " + p2);

    }
}
