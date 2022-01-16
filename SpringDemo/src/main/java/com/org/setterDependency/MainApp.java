package com.org.setterDependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Appconfig.class);
		Company cm = con.getBean(Company.class);
		cm.showDepartmentInfo();
		con.close();

	}

}
