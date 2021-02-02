package com.atuigu.api.newdate;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class TestDate {


    @Test
    public void test01() {
    /*
    LocalDate:年月日

     不可变的日期 一旦对日期做出修改 会生成一个新的LocalDate 记录改变后的日期
     minusDays(): 日期减少
     */
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        System.out.println(year);
        Month month = now.getMonth();//NOVEMBER
        System.out.println(month.getValue());

        //让当前日期-2
        LocalDate localDate = now.minusDays(2);


        System.out.println("now = " + now);

        System.out.println("localDate = " + localDate);


    }

    @Test
    public void test02() {
        LocalDate of = LocalDate.of(2020, 1, 1);
        System.out.println(of);
        LocalDate localDate = of.plusDays(2);
        System.out.println(localDate);
    }

    @Test
    public void test03() {
        //1 纳秒=0.000000001 秒
        LocalTime localTime = LocalTime.now();
        //15:27:15.366
        System.out.println(localTime);
    }


    @Test
    public void test04() {


        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

    /*
    设置指定的时间
     */
        LocalDateTime of = LocalDateTime.of(2020, 1, 1, 1, 1);


        System.out.println(of);
    }

    @Test
    public void test05() {

        LocalDate l1 = LocalDate.now();
        LocalDate l2 = LocalDate.of(2000, 11, 10);

        Period period = Period.between(l2, l1);
        System.out.println(period);

        System.out.println("差几年period.getYears() = " + period.getYears());
        System.out.println("差几月period.getMonths() = " + period.getMonths());
        System.out.println("差几天period.getDays() = " + period.getDays());
    }

    @Test
    public void test06() {

        LocalDateTime l1 = LocalDateTime.now();

        LocalDateTime l2 = LocalDateTime.of(2020, 2, 2, 2, 2);
        Duration duration = Duration.between(l2, l1);
        System.out.println("duration = " + duration);

        //获取两个时间短之间隔了多少天
        System.out.println("duration.toDays() = " + duration.toDays());
        //获取两个时间短之间隔了多少小时
        System.out.println("duration.toHours() = " + duration.toHours());
    }

    @Test
    public void test07() {
        /*
        DateTimeFormatter 有提供好的模板 直接使用
        将日期对象转为字符串
         */
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        LocalDateTime l1 = LocalDateTime.now();

        String format = formatter.format(l1);

        System.out.println(format);

        System.out.println("------------------------------------------");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E");


        String result = formatter1.format(l1);

        System.out.println(result);


    }

    @Test
    public void test08() {
        /*
        新的日期格式化类  小时 使用 HH
         */
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = "2020-11-11 03:47:53";
        LocalDateTime time = LocalDateTime.parse(str, formatter1);

        time.toString();
        System.out.println(time);


    }
}
