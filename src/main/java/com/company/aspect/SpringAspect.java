package com.company.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
@Component
public class SpringAspect {

    private final static LocalDateTime now = LocalDateTime.now();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

    @Pointcut("execution( public void com.company.tasks.Print.printTask())")
    public void printTime() {
    }

    @Before("printTime()")
    public void beforeMethod(JoinPoint joinPoint) {
        String time = now.format(formatter);
        System.out.println("before" + joinPoint.getSignature().getName() + " time " + time);
    }

    @After("printTime()")
    public void afterMethod(JoinPoint joinPoint) {
        String time = now.format(formatter);
        System.out.println("after" + joinPoint.getSignature().getName() + " time " + time);
    }

}
