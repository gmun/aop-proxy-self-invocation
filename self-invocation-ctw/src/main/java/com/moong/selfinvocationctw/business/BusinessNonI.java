package com.moong.selfinvocationctw.business;

import org.springframework.stereotype.Component;

@Component
public class BusinessNonI {
	public void ready() {
		System.out.println("ready...");
		go();
	}

	public void go() {
		System.out.println("go...");
	}
}
