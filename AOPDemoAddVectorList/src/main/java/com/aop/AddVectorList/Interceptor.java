package com.aop.AddVectorList;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Interceptor {
	Long start=0L;
	Long end=0L;
	@Pointcut("execution(* AddIntegersToList.*(..))")
	public void parameter_pointcut(){}
	
	@Before("parameter_pointcut()")
	public void calculateTime(){
		System.out.println("before");
		start=System.currentTimeMillis();
	}
	
	@After("parameter_pointcut()")
	public void calculateTimeafter(){
		System.out.println("after");
		end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	

}
