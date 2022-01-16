package com.org.setterDependency;

import org.springframework.stereotype.Component;

@Component
public class DepartmentImpl implements Department {

	public void showDepartmentInfo() {
		System.out.println("Department method");
	}

	
}
