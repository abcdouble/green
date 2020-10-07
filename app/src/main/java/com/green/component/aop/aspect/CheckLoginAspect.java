package com.green.component.aop.aspect;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.green.component.LoginActivity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class CheckLoginAspect {

    private static final String TAG = "CheckLoginAspect";

    @Pointcut("execution(@com.green.component.aop.annotation.CheckLogin * *(..))")
    public void checkLoginPointCut(){}

    @Around("checkLoginPointCut()")
    public Object jointPoint(ProceedingJoinPoint joinPoint) throws Throwable {

        if (joinPoint==null){
            return null;
        }

       Context context = (Context) joinPoint.getThis();
       if (false){
           Toast.makeText(context,"in the login state",Toast.LENGTH_SHORT).show();
           Log.d(TAG,"intercepte the click event, detected user int the login state");

           return joinPoint.proceed();
       }else {
           Toast.makeText(context,"in the logout state",Toast.LENGTH_SHORT).show();
           Log.d(TAG,"intercepte the click event, detected user int the logout state");

           context.startActivity(new Intent(context, LoginActivity.class));
           return null;
       }

    }

}
