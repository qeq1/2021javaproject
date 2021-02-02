package com.atguigu.method.methodtest3;

/*
  判断一个数是不是质数
  定义一个方法 接收一个整数（ 最小的质数是2 ） 是质数 返回 true 不是质数 返回false

 */
public class ReturnAndParamTest {

    public static void main(String[] args) {
        boolean zhiShu = isZhiShu(15);
        System.out.println("zhiShu = " + zhiShu);
    }

    /**
     * 判断一个数 是不是质数
     * @param num 要判断的数
     * @return 是否为质数
     */
    public static boolean isZhiShu(int num){
        //除了一盒本身之外不再有其他的约数
        // 9  : 2 3 4 5 6 7 8
        for(int i = 2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        //如果整个循环都结束了 可以判断次数为质数
        return true;

    }
}
