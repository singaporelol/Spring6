package com.spring6.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler {
    private OrderService target;
    public TimerInvocationHandler(OrderService target) {
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 目标执行之前增强。
        long begin = System.currentTimeMillis();
        // 调用目标对象的目标方法
        Object retValue = method.invoke(target, args);
        // 目标执行之后增强。
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
        // 一定要记得返回哦。
        return retValue;
    }
}
