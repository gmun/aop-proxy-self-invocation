package com.moong.selfinvocation.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Pointcut("execution(void com.moong.selfinvocation.business.Business*.go(..))")
	public void myPointcut() { }
	
	@Before("myPointcut()")
	public void before() {
		System.out.println("Advice logic...");
	}
}
