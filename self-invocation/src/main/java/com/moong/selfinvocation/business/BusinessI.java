package com.moong.selfinvocation.business;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class BusinessI implements Business{

	@Override
	public void ready() {
		System.out.println("ready...");
		//go();
		((Business) AopContext.currentProxy()).go();
	}

	@Override
	public void go() {
		System.out.println("go...");
	}
}
