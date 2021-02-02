package com.exception.test3;
/*

发生异常时 如果没有进行处理
   会一层 一层的 向上抛出  最终交给 JVM处理
  终止程序 输出对应的信息


  希望谁发生异常 谁就处理异常

 */
public class TestException {
    //JVM
    public static void main(String[] args) {
        System.out.println("this is  main()");
        show2();
        System.out.println("this is  main2()");
    }

    public static void show2(){
        show();
    }

    public static void show(){
        System.out.println("this is  show");
        int [] arr = {20,30};
        try{
            System.out.println(arr[3]);// 在此位置发生了异常 ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
           // e.printStackTrace();
        }
        System.out.println("Game Over!!!");
    }
}


