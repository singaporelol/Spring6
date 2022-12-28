package com.spring6.service;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* com.spring6.service.OrderService.*(..))")
    public void pointcut(){}
    @Before("execution(* com.spring6.service.OrderService.*(..))")
    public void advice(){
        System.out.println("我是一个通知！！");
    }
    @AfterReturning("pointcut()")
    public void afterReturningAdvice(){
        System.out.println("后置通知");
    }
}
