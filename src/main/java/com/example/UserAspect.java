package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect
{
    @Around("execution(* com.example.UserService.doTask(..))")
    public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("find my advice before the method...");
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getTarget());
        Object[] intA = joinPoint.getArgs();
        for (int i = 0; i < intA.length; i++)
        {
            System.out.println(intA[i]);
        }
        joinPoint.proceed();
        System.out.println(joinPoint.getSignature().getName());
        System.out.println("find my advice after the method...");
    }
}
