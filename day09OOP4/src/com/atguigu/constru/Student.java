package com.atguigu.constru;

/*
构造器：可以快速给成员变量赋值

语法： [权限修饰符] 类名（形参列表）{

     }

注意：
  1.每一个类中都会有一个默认的无参的构造器
    但是 当声明有参的构造器之后 默认的无参的构造器就会消失
  2.建议 自定义类 都【手动】提供一个默认的无参的构造器

  3.构造方法 实际上是一个特殊的方法

  4.当成员变量与局部变量的名字重复的时候 在成员变量前+this 用于区分 我是成员变量
      this.name

  5.构造器/构造方法/构造函数 是可以重载的

 */
public class Student {
    String name;
    int age;
    int score;
    double height;
    /*
    [权限修饰符] 类名（形参列表）{

     }
     */

    public Student(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public Student(String name, int age, int score, double height) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.height = height;
    }

    public Student() {
    }

    /*public Student(String n, int a, int s, double h) {
        name = n;
        age = a;
        score = s;
        height = h;
    }*/
    /*
    描述学生的信息
     */
    public void showInfo() {
        System.out.println("名字是：" + name + ",年龄是：" + age + ",分数是：" + score + ",身高是：" + height);
    }

}
