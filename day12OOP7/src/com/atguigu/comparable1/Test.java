package com.atguigu.comparable1;
/*
一.引用数据类型比较
    Comparable:[内部]比较器
          在比较对象类的内部 完成了 比较规则的制定
    Comparator:[外部]比较器

二.使用内部比较器比较 Comparable
   1.让想要比较的对象的【类】 实现 Comparable 接口

   2.实现接口后 重写comparaTo()方法

   3.在重写的方法内定义比较规则

      前一个数大于后一个数返回一个正数

      俩数相等  返回0

      前一个数小于后一个数返回一个负数






 */
public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("李白", 19);
        Person p2 = new Person("杜甫", 19);
        //按年龄比较

        int i = p1.compareTo(p2);
        if(i>0){
            System.out.println(p1.name+" > "+p2.name);
        }else if(i<0){
            System.out.println(p1.name+" < "+p2.name);
        }else{
            System.out.println(p1.name+" =="+p2.name);
        }
    }
}

class Person implements Comparable{
    @Override
    public int compareTo(Object o) {//Object o = p2;

        Person p = (Person)o;

        return this.age - p.age;
    }
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
