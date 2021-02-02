package com.atguigu.object.finalize;
/*

对象被回收之前 会 调用 finalize() 方法

final  finalize finally ?



 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            Student s = new Student(i+19, 1.89, "李白"+i);
        }
        //通知垃圾回收器回收
        System.gc();

        Thread.sleep(2000);

        System.out.println("Game Over!!");

    }
}

class Student{


    private int age;
    private double height;
    private String name;


    @Override
    protected void finalize() throws Throwable {
        System.out.println("轻轻我走了 正如我轻轻的来............");
    }

    public Student() {
    }

    public Student(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
