package com.atuigu.api.date;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest1 {

    /*
      Date date = new Date();
      Date date1 = new Date(1605075548459L);
      将当前时间 转为long值
        long time = date.getTime();
        //将 date对象 输出为 一个字符串  2020-11-11 14:19:08
          String s = date1.toLocaleString();

     */

    @Test
    public void test01() {
        Date date = new Date();
        //Wed Nov 11 14:13:34 CST 2020
        System.out.println(date);//120
        // 0带表第一个月
        System.out.println("date.getMonth() = " + date.getMonth());
        // 日期
        System.out.println("date.getDate() = " + date.getDate());
        //一周的第几天
        System.out.println("date.getDay() = " + date.getDay());

        System.out.println(date.getYear() + 1900);


        long time = date.getTime();

        System.out.println(time);

//Wed Nov 11 14:19:08 CST 2020
        Date date1 = new Date(1605075548459L);

        System.out.println(date1);
//2020-11-11 14:19:08
        String s = date1.toLocaleString();
        System.out.println("s = " + s);

    }

    @Test
    public void test02() {
        /*
        只有年月日 没有时分秒

        注意：当出现了同名的类型 需要全路径导入
          包名+类名
         */

        java.sql.Date date = new java.sql.Date(1605075548459L);
        System.out.println(date);

    }


    @Test
    public void test03() {

        /*
        Calendar 抽象类 不能直接创建对象

        需要通过子类实现功能  或者
        调用getInstance（）创建 Calendar对象
        java.util.GregorianCalendar[time=1605076288764,
        areFieldsSet=true,areAllFieldsSet=true,
        lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
        YEAR=2020,MONTH=10,WEEK_OF_YEAR=46,
        WEEK_OF_MONTH=2,
        DAY_OF_MONTH=11,
        DAY_OF_YEAR=316,
        DAY_OF_WEEK=4,
        DAY_OF_WEEK_IN_MONTH=2,
        AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=31,SECOND=28,MILLISECOND=764,ZONE_OFFSET=28800000,DST_OFFSET=0
         */
        Calendar calendar = Calendar.getInstance();


        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));
        //月份从0开始
        System.out.println("calendar.get(Calendar.MONTH) = " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("calendar.get(Calendar.DAY_OF_MONTH) = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("calendar.get(Calendar.HOUR) = " + calendar.get(Calendar.HOUR));

        System.out.println(calendar);
        //2020 11 11

        /**
         * 修改日期
         *
         *
         * 属性： year month  ....
         * 值： 整数 向前 +
         *      负数 向后-
         *  calendar.add(属性, 值);
         */
        //calendar.add(Calendar.YEAR, -2);

        //设置为指定日期
        calendar.set(1998, 1, 1);
        //2022
        System.out.println(calendar.get(Calendar.YEAR));


    }


    @Test
    public void test04() {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String availableID : availableIDs) {
            System.out.println(availableID);
        }
    }


    @Test
    public void test05(){
        /*
        日期转换
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");

          日期---》字符串
            df.format(日期对象);
            date ---> 2020 2020-11-11 14:48:33 星期三

          字符串--》日期
           Date date =  df.parse(字符串)；

           注意：
               要解析的字符串内容 必须与 格式完全匹配  否则 报错
                java.text.ParseException: Unparseable date: "2020-11/11 14:53:28"
         */

       // 新建日期格式化类

        DateFormat df = new SimpleDateFormat("yyyyMM月dd天 HH:mm:ss E");

        Date date = new Date();
        //Wed Nov 11 14:48:33 CST
        //2020 2020-11-11 14:48:33 星期三
        System.out.println(date);


        String result = df.format(date);

        System.out.println(result);

    }

    @Test
    public void test06() throws ParseException {
        String dateStr = "2020/11/11 14:53:28";

        //新建日期格式化对象

        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date date =  df.parse(dateStr);

        System.out.println(date);











    }
}
