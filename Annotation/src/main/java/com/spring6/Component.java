package com.spring6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***
 *
 * */
//自定义了一个注解：Component
//Target：用来设置Component注解可以出现的位置，ElementType.TYPE表示Component注解只能出现在类和接口上
//
//
//
//
//
//
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Component {
    String value();
}
