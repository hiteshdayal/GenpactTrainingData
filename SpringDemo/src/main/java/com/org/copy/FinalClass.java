package com.org.copy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.copy")
public class FinalClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(FinalClass.class);
		Writer w = con.getBean(FictionWriter.class);
		w.write();
		w.getAward();
		con.close();

	}

}
