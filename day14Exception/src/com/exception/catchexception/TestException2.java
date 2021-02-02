package com.exception.catchexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {

    public static void main(String[] args) {

        //定义变量 记录总分
        double sum = 0;
        //创建数组 记录学生的成绩
        double score[] = new double[2];
        try {
            // System.out.println(score[3]);
            //创建键盘输入的对象
            Scanner in = new Scanner(System.in);

            for (int i = 0; i < score.length; i++) {
                System.out.println("请您输入第" + (i + 1) + "个学生的成绩");
                //接收学生的成绩
                double s = in.nextDouble();
                //将学生的成绩存到数组内
                score[i] = s;
                //求总分
                sum += s;
            }
        } catch (Exception e) {
            System.out.println("发生了异常： " + e.getMessage());
        }

        //求平均分
        System.out.println("第一个学生的成绩是：" + score[0] + ",总分是：" + sum + ",平均分是：" + sum / score.length);

    }
}
