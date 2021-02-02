package com.atguigu.overload;

public class OverLoadTest2 {
    public static void main(String[] args) {


        double d1 = 3.14;

        double d2 = 4.28;
    }


    public static int getMaxNum(int...arr){

        int maxNum = arr[0];

        for (int i : arr) {
            if(i>maxNum){
                maxNum=i;
            }
        }

        return maxNum;
    }

    public static double getMaxNum(double...d){

        double maxNum = d[0];

        for (double v : d) {

            if(v>maxNum){
                maxNum = v;
            }
        }
        return maxNum;
    }
}
