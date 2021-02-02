package com.atguigu.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) //只注解可以存活到运行时
public @interface MyAnn {

    String value() default "哈哈";

}
