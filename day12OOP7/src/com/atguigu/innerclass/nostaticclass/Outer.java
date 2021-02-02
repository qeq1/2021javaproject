package com.atguigu.innerclass.nostaticclass;


public class Outer {

    static int age = 20;
    int num = 30;

    class Inner {

        final static int ll = 90;
        String name = "李白";

        int num  =50;

        public void innerMethod2() {
            int num = 66;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);

        }

        public void innerMethod() {
            System.out.println(age);
            System.out.println(num);
           /* outerMethod1();
            outerMethod2();*/
        }

    }

    class  Inner1{}

    public void outerMethod1() {

        Inner in = new Inner();

        System.out.println(Inner.ll);

        System.out.println(in.name);

        in.innerMethod();
        System.out.println("this is outerMethod1()");
    }

    public static void outerMethod2() {
        System.out.println("this is static outerMethod2()");
    }


}
