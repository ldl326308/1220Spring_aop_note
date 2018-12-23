package com.nf.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Aspect
@Component
public class AdminAdvice {

    @Autowired
    private HttpSession session;

    @Around("execution(* com.nf.controller.AdminController.login(..))")
    public Object login(ProceedingJoinPoint joinPoint){

        System.out.println("环绕通知（一）");

        try {

            System.out.println("环绕通知（二）");
            Object o = joinPoint.proceed();

            System.out.println("环绕通知（三）");

            String name = (String) session.getAttribute("name");
            String password = (String) session.getAttribute("password");

            if(name.equals("lc") && password.equals("123")){
               // return "登入成功！";
                return "成功了哎";
            }
            return "登入失败";


        } catch (Throwable throwable) {
            throwable.printStackTrace();

        }


        return null;


    }

}
