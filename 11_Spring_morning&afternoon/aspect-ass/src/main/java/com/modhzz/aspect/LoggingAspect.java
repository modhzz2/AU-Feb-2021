package com.modhzz.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void beforeAdvice() {
		System.out.println("Advice before allgetter method ");
	}
	
//	@After("allGetters()")
//	public void afterAdvice() {
//		System.out.println("Advice after allgetter method ");
//	}

	@AfterReturning("args(name)")
	public void stringArgument(String name) {
		System.out.println("Advice after returning the new city name, which is " + name);
	}
	
	@AfterThrowing(pointcut = "args(name)", throwing = "e")
	public void throwingException(String name, Exception e) {
		System.out.println("Advice after throwing an exception and exception thrown is " + e.toString());
	}

	@Around("args(String)")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnvalue = null;
		try {
			System.out.println("Before Proceeding");
			returnvalue = proceedingJoinPoint.proceed();
			System.out.println("After returning");
		} catch (Throwable e) {
			System.out.println("After throwing");
		}
		System.out.println("After finally");
		return returnvalue;
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}
}
