package com.org.Demo;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 implements Employee {

	public TestBean1() {
		System.out.println("testbean constructor");
	}
	
	@Override
	public void doWork() {
		System.out.println("Test bean1 method");
		
	}

	
}
