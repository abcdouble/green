package com.green.component.aop.aspect;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.green.component.LoginActivity;
import com.green.component.aop.annotation.ClickBehavior;

import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class ClickBehaviorAspect {
    private static final String TAG = "ClickBehaviorAspect";

    @Pointcut("execution(@com.green.component.aop.annotation.ClickBehavior * *(..))")
    public void clickBehaviorPointCut(){}

    @Around("clickBehaviorPointCut()")
    public Object jointPointCut(ProceedingJoinPoint joinPoint) throws Throwable {

        if (joinPoint==null){
            return null;
        }

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        String className = methodSignature.getDeclaringType().getSimpleName();


        String methodName = methodSignature.getName();

       String funName = methodSignature.getMethod().getAnnotation(ClickBehavior.class).value();

       long begin = System.currentTimeMillis();
        Log.d(TAG, "ClickBehavior  begin  ");
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - begin;
        Log.e(TAG, "ClickBehavior  end  ");
        Log.e(TAG, String.format("statistic：%s function，in %s class %s function，total time %d ms",
                funName, className, methodName, duration));

        return result;

    }

}
