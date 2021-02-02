package com.atguigu.supertest;
/*
1.每一个构造器的首行 都会有一个默认的隐藏的super() 调用父类无参的构造器

2.当出现 this（）调用本类中构造器时 那个默认的super()自动消失

3.可以使用 super(参数)调用父类有参的构造器

4.可以使用 super.去调用父亲的方法
  可以使用 super.父类的属性

 */
public class TestSmallTeacher {
    public static void main(String[] args) {

/*
        SmallTeacher smallTeacher = new SmallTeacher();

        smallTeacher.name = "李白";
        smallTeacher.age=19;
        smallTeacher.score=99;

        smallTeacher.getInfo();*/


   /* SmallTeacher smallTeacher = new SmallTeacher(1.87, 99);

    smallTeacher.getInfo();*/

   SmallTeacher smallTeacher = new SmallTeacher(1.98, 99, "杜甫", 20);

   smallTeacher.getInfo();
    }
}
