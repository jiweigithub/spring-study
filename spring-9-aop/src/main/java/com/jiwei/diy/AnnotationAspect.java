package com.jiwei.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Aspect标注这个类是一个切面
 */
@Aspect
public class AnnotationAspect {


    @Before(value = "execution(* com.jiwei.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("============方法执行前=============");
    }

    @After(value = "execution(* com.jiwei.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("============方法执行后=============");
    }

    @Around(value = "execution(* com.jiwei.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.toString());
        System.out.println("============方法环绕前=============");
        joinPoint.proceed();
        System.out.println("============方法环绕后=============");
    }

}
