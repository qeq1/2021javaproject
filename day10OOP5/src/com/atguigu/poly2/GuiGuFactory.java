package com.atguigu.poly2;

/**
 * 硅谷工厂 专门生产程序员
 */
public class GuiGuFactory {

/*
Programmer a = new Chinese();
Programmer = new Japan()；
Programmer = new Indian()；

 */
    public static Programmer productProgrmmer(String message) {

        if ("中国".equals(message)) {//中国
            return new Chinese();
        } else if ("日本".equals(message)) {//日本
            return new Japan();
        } else if ("印度".equals(message)) {//"印度"
            return new Indian();
        }
        return null;
    }
    //
   /* public static Programmer productProgrmmer(String message) {


        Programmer programmer = null;

        if ("中国".equals(message)) {
            programmer = new Chinese();

        } else if ("日本".equals(message)) {
            programmer = new Japan();
        } else if ("印度".equals(message)) {
            programmer = new Indian();
        }
        return programmer;
    }*/
}
