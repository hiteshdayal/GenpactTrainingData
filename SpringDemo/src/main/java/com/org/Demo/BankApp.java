package com.org.Demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Manager m = con.getBean(Manager.class);
		m.callMeeting();
	}
	
}
