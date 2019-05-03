package com.moong.selfinvocation.business;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Proxy;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAspectJAutoProxy(exposeProxy=true)
public class AopContextTest {
	
	@Autowired private Business businessI;
	
	@Test
	public void isJDKProxySelefInvocation() {
		assertTrue(Proxy.isProxyClass(businessI.getClass()));
		System.out.println(businessI.getClass());
		businessI.ready();
	}
	
	
	@Autowired private BusinessNonI businessNonI;	
	@Test @Ignore
	public void isCGLibSelfInvocation() {
		assertTrue(Enhancer.isEnhanced(businessNonI.getClass()));
		System.out.println(businessNonI.getClass());
		businessNonI.ready();
	}
}
