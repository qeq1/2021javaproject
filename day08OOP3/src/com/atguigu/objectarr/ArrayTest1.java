package com.atguigu.objectarr;

/*
对象数组
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //数据类型 [] 标识符 = {数据类型的元素}；
        Person p1 = new Person();
        p1.name="李白";
        p1.age = 18;
        Person p2 = new Person();
        p2.name="杜甫";
        p2.age = 19;
        Person[] perArr = {p1,p2};
        for(Person p:perArr){
            p.show();
        }
    }
}
class Person{
    String name;
    int age;
    public void show(){
        System.out.println("名字是："+name+",年龄是："+age);
    }
}