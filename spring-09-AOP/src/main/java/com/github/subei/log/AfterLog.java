package com.github.subei.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    // returnValue:返回值
    // method:被调用的方法
    // args:被调用的方法的对象的参数
    // target:被调用的目标对象
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "，返回结果为:" + returnValue);
    }
}