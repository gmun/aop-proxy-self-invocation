package com.moong.selfinvocation.business;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAspectJAutoProxy
public class ResourceTest {

	@Autowired private Business businessWithResource;
	
	@Test
	public void isSelefInvocation() {
		assertTrue(Proxy.isProxyClass(businessWithResource.getClass()));
		System.out.println(businessWithResource.getClass());
		businessWithResource.ready();
	}
}
