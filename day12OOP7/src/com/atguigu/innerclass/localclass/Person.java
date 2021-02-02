package com.atguigu.innerclass.localclass;

import com.atguigu.utils.SortUtils;
import com.sun.media.sound.SoftTuning;
import org.junit.Test;

/*
局部内部类：局部变量【特别不重要】

语法结构：
 外部类 类名{
    [权限修饰符] [static] 返回值类型 方法名（形参列表）{
        [修饰符] class 类名{


        }
    }
 }

 注意：
    1.局部内部类 只能被 default修饰
    2.局部内部类 可以被 final /abstract修饰

    3.局部内部类使用外部类的资源要看外部类的方法是静态还是非静态
       方法为非静态  可以使用外部类静态或者非静态的资源
       方法为静态  可以直接使用外部类中静态的资源
    4.局部内部类编译成功后 也会产生对应的字节码文件
       外部类的名字$序号内部类的名字
       Person$2Inner.class

    5.局部内部类中 不能存在静态的属性但是可以存在静态的常量

    6.在方法内 创建内部类对象  通过内部类对象 调用 内部类中的方法

    7.当在局部内部类的方法内 使用 局部变量时  那么变量前会自动加一个final（jdk1.8）




 */
public class Person {

    int age = 30;

    static String name = "李白";

    public static void main(String[] args) {

       /* Person p = new Person();

        p.show();*/

       new Person().show();

       // Person.outerMethod();
    }

    @Test
    public void test01(){

        // 父类 标识符 = new 子类（）；
        Object obj = new Object(){
            public void method1(){
                System.out.println("666666");
            }

        };

    }






    public void show() {
        //局部变量
        int num = 20;
        class Inner {
            int age = 90;
            final static int num = 99;
            public void innnerMethod() {
               /* System.out.println(age);
                System.out.println(name);*/

                System.out.println("this is innnerMethod()");
            }
        }
      /*  Inner in = new Inner();

        in.innnerMethod();*/
    }

   /* public static void outerMethod() {
        class Inner {


            //   final   static int num =99;
            public void innerMethod1() {
                System.out.println(name);
            }
        }
    }*/
}
