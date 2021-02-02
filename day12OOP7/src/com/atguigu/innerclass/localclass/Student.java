package com.atguigu.innerclass.localclass;

interface Run {
    void run();
}

public class Student {

    public static void main(String[] args) {

        Student s = new Student();
        Run run = s.outerMethod();

        run.run();

    }

    public Run outerMethod() {

        int num = 20;

        class Inner implements Run {
            @Override
            public void run() {
                System.out.println("this is innerMethod\t" + num);
            }
        }
        return new Inner();
    }
}
