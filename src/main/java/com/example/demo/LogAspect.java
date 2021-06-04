package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.example.demo.HelloController.*(..))")
    public void printLog() {

    }

    @Before("printLog()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before ... " + joinPoint.getKind() + "," + joinPoint.toLongString());
    }

    @After("printLog()")
    public void after(JoinPoint joinPoint) {
        System.out.println("After ... " + joinPoint.getKind() + "," + joinPoint.toLongString());
    }
}