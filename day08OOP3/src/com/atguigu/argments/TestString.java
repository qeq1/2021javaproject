package com.atguigu.argments;

/*
返回n个字符串拼接结果，如果没有传入字符串，那么返回空字符串""
 */
public class TestString {
    public static void main(String[] args) {

        String result = test("hello", "world");

        System.out.println(result);

        String test = test();
        System.out.println("test = " + test + "你好");
        //如果方法有返回值可以直接放到输出语句内 输出的是 方法返回的结果
        System.out.println(test("李白", "杜甫", "白居易"));

/*
如果方法没有返回值 不能直接放到输出语句内
System.out.println(message());
 */

    }

    public static String test(String... arr) {

        //定义变量记录拼接的结果
        String result = " ";

        for (String s : arr) {
            result = result + s;
        }

        return result;

    }

    public static void message() {
        System.out.println("this is message()");
    }
}
