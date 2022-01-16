package com.org.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FinalClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		Writer w = con.getBean(FictionWriter.class);
		w.write();
		w.getAward();
		con.close();

	}

}
