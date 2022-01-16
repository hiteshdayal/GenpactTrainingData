package com.org.setterDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// setter based dependencies

@Component
public class Company implements Department {

	
	Department department;
	
	
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public void showDepartmentInfo() {
		department.showDepartmentInfo();
		
	}
	
	
}
