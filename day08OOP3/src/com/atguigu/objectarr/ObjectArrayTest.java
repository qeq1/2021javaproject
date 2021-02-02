package com.atguigu.objectarr;

import javax.sound.midi.Soundbank;

/*
（1）定义学生类Student

​	声明姓名和成绩实例变量，

​	getInfo()方法：用于返回学生对象的信息

（2）测试类ObjectArrayTest的main中创建一个可以装3个学生对象的数组，并且按照学生成绩排序，显示学生信息
 */
public class ObjectArrayTest {
    public static void main(String[] args) {
        //创建可以装三个学生对象的数组
        Student[] stuArr = new Student[3];
        //创建对象
        Student s1 = new Student();
        s1.name = "高圆圆";
        s1.score = 100;

        Student s2 = new Student();
        s2.name = "貂蝉";
        s2.score = 99;

        Student s3 = new Student();
        s3.name = "卢本伟";
        s3.score = 55;

        //将对象放到数组内
        stuArr[0] = s1;
        stuArr[1] = s2;
        stuArr[2] = s3;

        //排序前
        for (Student s : stuArr) {
            s.getInfo();
        }
        //调用排序的方法
        sort(stuArr);
        System.out.println("--------------------------------------------------");
        //排序后
        for (Student s : stuArr) {
            s.getInfo();
        }
    }
    /**
     * 对学生数组进行排序
     * @param arr 学生数组
     */
    public static void sort(Student[] arr){
        for(int i = 0;i<arr.length-1;i++){

            for(int j = 0;j<arr.length-1-i;j++){

                //当前一个学生的分数大于后一个学生的分数 俩学生换位置
                if(arr[j].score>arr[j+1].score){

                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}

class Student {
    public String name;
    public int score;

    public void getInfo() {

        System.out.println("姓名是：" + name + "分数是：" + score);

    }


}
