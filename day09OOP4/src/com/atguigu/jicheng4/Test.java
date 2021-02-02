package com.atguigu.jicheng4;
/*
1、声明父类：Person类
包含属性：姓名，年龄，性别
属性私有化，get/set
包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男

2、声明子类：Student类，继承Person类
新增属性：score成绩
属性私有化，get/set
包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89

3、声明子类：Teacher类，继承Person类
新增属性：salary薪资
属性私有化，get/set
包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男，薪资：10000


 */
public class Test {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("张三");
        s.setSex('男');
        s.setAge(18);

        s.setScore(99);
        s.getInfo();


        Teacher teacher = new Teacher();
        teacher.setName("张老师");
        teacher.setAge(39);
        teacher.setSex('男');
        teacher.setSalary(20000);


        teacher.getInfo();



    }
}
