package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {
	long start;
	long end;
	@Pointcut("execution(* UserHandler.*(..))")
	public void parameter_pointcut(){}
	@Before("parameter_pointcut()")
	public void countSessionBefore(){
		start=System.currentTimeMillis();
	}
	@After("parameter_pointcut()")
	public void countSessionAfter(){
		end=System.currentTimeMillis();
		System.out.println("time   " + (end-start));
	}
	@AfterThrowing("parameter_pointcut()")
	public void countSessionAfterThrowing(){
		System.out.println("throwing exception");
		end=System.currentTimeMillis();
		System.out.println("time   " + (end-start));
	}
	
}
