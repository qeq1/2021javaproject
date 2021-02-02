package com.atguigu.changevalue;

/**
 * 需求：交换 x y的位置
 *
 * 引用数据类型传递的是地址值。
 */
public class ChangeValueTest2 {

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 66;
        point.y = 88;
        System.out.println("交换前：" + "(x:" + point.x + ",y:" + point.y + ")");// x:66 ,y:88
        //调用方法
        changeValue(point);
        System.out.println("交换后：" + "(x:" + point.x + ",y:" + point.y + ")");//x:66 , y:88
    }
    //交换的方法
    public static void changeValue(Point point) {

      //  point = new Point();
        int temp = point.x;
        point.x = point.y;
        point.y = temp;


        System.out.println("交换中：" + "(x:" + point.x + ",y:" + point.y + ")");// x:88 y:66
    }
}

class Point {
    public int x;

    public int y;
}

