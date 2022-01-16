package com.org.autotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		AOneClass a1 = con.getBean(AOneClass.class);
		a1.display();
	}

}
