/*

类：对一类事物共有特征的抽象描述
1.如何创建类

[权限修饰符] class 类名{


}

对象： 一个具体的实例 对象

2.如何创建对象

类名 标识符 = new 类名();

java.util.Scanner input = new java.util.Scanner();


3.类的成员有哪些？
  属性（成员变量）
  方法
  构造器
  代码块
  内部类

注意：

 1.成员变量 ： 在类中 方法外

 2.每创建一个对象 就会分配一块独立的空间 存储相关成员变量的信息



 */

public class TestStudent {

    public static void main(String[] args) {
        // int a =  10;
        Student s1 = new Student();
        s1.name = "范冰冰";
        s1.age = 18;
        s1.sex = '女';
        System.out.println(s1.name + "," + s1.age + "," + s1.sex);
        Student s2 = new Student();
        s2.name = "杨幂";
        s2.age = 40;
        s2.sex = '女';
        System.out.println(s2.name + "," + s2.age + "," + s2.sex);

        Student s3 = new Student();
        System.out.println(s3.name);
        System.out.println(s3.age);

    }
}
