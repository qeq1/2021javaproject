package com.atguigu.method.methodtest3;
/*
带返回值类型的方法

[public] [static ] 返回值类型 方法名（形参）{

return 对应返回值类型的数据;

}
return : 1.结束方法
         2.将值返回到方法调用处

注意： 如果一个方法带有返回值类型 那么必须返回一个对应的值 否则会报错。

什么时候使用带返回值的方法？什么时候不使用？

  1.如果此方法的结果 别的方法使用 就需要带返回值

  2.反之就不需要


需求： 给我传入一个字符串 然后 我返回一个结果 此结果是在原有基础上 +"hello"；
 */

public class ReturnTest {

    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println("main()===>"+result);

        String result1 = test("李白");

        System.out.println("result1 = " + result1);
    }

    public static int sum(int num1, int num2) {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int sum = num1 + num2;

        return sum;
        // System.out.println("sum = " + sum);
    }




    public static String test(String name){

        String result = name+"hello";

        return result;
    }
}
