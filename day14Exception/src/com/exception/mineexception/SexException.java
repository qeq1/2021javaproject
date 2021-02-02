package com.exception.mineexception;


/*

自定义异常的步骤：

1.新建一个类

2.继承一个异常类
   想要自定义运行时异常 那么继承运行时异常 反之 继承 编译时异常


3.添加构造器


 */
public class SexException extends IndexOutOfBoundsException {


    public SexException() {
    }
    public SexException(String s) {
        super(s);
    }
}
