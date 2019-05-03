package com.moong.selfinvocation.business;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class BusinessWithResource implements Business{

	@Resource(name="businessWithResource") Business self;

	@Override
	public void ready() {
		System.out.println("ready...");
		self.go();
	}

	@Override
	public void go() {
		System.out.println("go...");
	}
}
