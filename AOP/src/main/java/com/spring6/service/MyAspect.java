package com.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(* com.spring6.service.OrderService.*(..))")
    public void advice(){
        System.out.println("我是一个通知！！");
    }
}
