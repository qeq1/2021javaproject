package com.exception.catchexception;
/*
一.异常处理：
   两种方案
     1.try{}cahtch(){}

     2.throw throws 抛出异常


二.使用try{}catch(){}处理
    try{

    可能发生异常的代码

    }catch(异常类型 标识符){// 此位置 已经创建了一个异常对象
        对异常进行处理

    }
注意：
   1.变量的作用域
      try中声明的变量 仅仅在 try中有效
   2.当发生异常后  try语句块内 异常下面的额代码 不再执行 ==》进到 catch内 ===>处理异常 ===》进行try{}catch(){}下的内容

   3.如果没有发生异常 则 不会执行 catch（）中的内容

   4.如果发生了 没有捕获（声明）的异常  则程序立即终止  不会继续向下执行


   5.当try语句块代码 可能发生多个异常时 我们可以 声明多个异常
       5.1方式一
        catch(异常类型 | 异常类型  标识符){

        }
      catch (ArrayIndexOutOfBoundsException | InputMismatchException e)
      5.2方式2
       采用 多重catch()
          try{}catch(异常类型1 标识符){

          }catch(异常类型2  标识符){

          }。。。。。。
          发生了什么异常就会进到 对应的catch 中

 6.如果采用了多重catch 那么可以省略为一个Exception

        必须放到 多重catch的末尾 否则报错

        子类异常在前面 父类异常在后面

 */

import java.util.InputMismatchException;
import java.util.Scanner;

//输入学生的成绩 求平均非以及总分
public class TryCatchTest1 {

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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("发生了异常： " + e.getMessage());
        } catch (InputMismatchException i) {
            System.out.println("发生了异常：===> " + i.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){

        }

        //求平均分
        System.out.println("第一个学生的成绩是：" + score[0] + ",总分是：" + sum + ",平均分是：" + sum / score.length);

    }
}
