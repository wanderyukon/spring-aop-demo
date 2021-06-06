package com.example.demo.aspect;

import com.example.demo.annotation.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Before("@annotation(log)")
    public void before(JoinPoint joinPoint, Log log) {
        System.out.println("Before ... " + joinPoint.getKind() + "," + joinPoint.toLongString());
    }

    @After("@annotation(log)")
    public void after(JoinPoint joinPoint, Log log) {
        System.out.println("After ... " + joinPoint.getKind() + "," + joinPoint.toLongString());
    }
}