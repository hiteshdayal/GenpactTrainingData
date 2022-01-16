package com.org.Demo;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {

	Accountant(){
		System.out.println("Inside Accountant constructor");
	}

	@Override
	public void doWork() {
		System.out.println("Inside Accountant dowork method");
		
	}
	
}
