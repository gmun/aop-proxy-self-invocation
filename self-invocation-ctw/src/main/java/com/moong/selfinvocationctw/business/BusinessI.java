package com.moong.selfinvocationctw.business;

import org.springframework.stereotype.Component;

@Component
public class BusinessI implements Business{
	
	@Override
	public void ready() {
		System.out.println("ready...");
		go();
	}

	@Override
	public void go() {
		System.out.println("go...");
	}
}
