package com.moong.selfinvocationctw.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Pointcut("execution(void com.moong.selfinvocationctw.business.BusinessI.go(..))")
	public void myPointcut() { }
	
	@Before(value="myPointcut()")
	public void myBefore() {
		System.out.println("Adivce logic...");
	}
}
