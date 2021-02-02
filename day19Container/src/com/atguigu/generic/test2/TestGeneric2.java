package com.atguigu.generic.test2;

import java.math.BigDecimal;
import java.util.Date;

public class TestGeneric2 {
    public static void main(String[] args) {

//public final class Integer extends Number implements Comparable<Integer>
        Integer i;
//public final class Double extends Number implements Comparable<Double>
        Double d;
//public class BigDecimal extends Number implements Comparable<BigDecimal>
        BigDecimal b;

        SumTools<Integer> sumTools = new SumTools<>(10, 20);

        Integer sum = sumTools.getSum();

        System.out.println(sum);


        SumTools<BigDecimal> s2 = new SumTools<>(new BigDecimal("3.14"), new BigDecimal("2.56"));


        BigDecimal sum1 = s2.getSum();

        System.out.println(sum1);

    }

}

/*
求俩数的和：
  既可以是正数
  也可以是小数
  BigDecimal

  如何判断一个元素 是数 还是 不是数？

  Integer

  Double

  BigDecimal

T extends Number & Comparable<T>
T: 既是 Number 的孩子 也是 Comparable 的孩子
指定了 T 的上限 ： 类型范围 不能超过父亲

 */
class SumTools<T extends Number & Comparable<T>> {
    private T t1;
    private T t2;

    public SumTools(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getSum() {

        if (t1 instanceof Integer) {
            Integer value = Integer.valueOf((Integer) t1 + (Integer) t2);
            return (T) value;
        } else if (t1 instanceof BigDecimal) {
            BigDecimal b1 = (BigDecimal) t1;
            BigDecimal b2 = (BigDecimal) t2;

            BigDecimal decimal = b1.add(b2);
            return (T) decimal;
        }
        throw new UnsupportedOperationException("您传入的数据 不能进行加法操作");
    }


}
