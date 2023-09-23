package com.example.ski.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class configAOP {
    @Before("execution(* com.example.ski.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint){
        log.info("In Method"+joinPoint.getSignature().getName());
    }
    @After("execution(* com.example.ski.service.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint){
        log.info("Out of Method"+joinPoint.getSignature().getName());
    }
    @AfterReturning("execution(* com.example.ski.service.*.*(..))")
    public void logMethodSuccess(JoinPoint joinPoint){
        log.info("Out of Method without errors"+joinPoint.getSignature().getName());
    }
    @AfterThrowing("execution(* com.example.ski.service.*.*(..))")
    public void logMethodExitErorr(JoinPoint joinPoint){
        log.info("Out of Method with errors"+joinPoint.getSignature().getName());
    }
    @Around("execution(* com.example.ski.service.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }

}
