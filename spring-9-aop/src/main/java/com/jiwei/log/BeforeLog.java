package com.jiwei.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    /**
     * @param method 目标对象要执行的方法
     * @param args   参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "->[method]->" + method.getName() + "->[执行前]");
    }
}
