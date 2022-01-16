package com.org.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer {

	@Autowired
	@Qualifier("PulitzerAward")
	private Award award;
	
	
	@Override
	public void write() {
		
		System.out.println("Technical write method.....");
		
	}

	@Override
	public void getAward() {
		
		System.out.println("Technical getAward method");
		award.award();
		
	}

	
}
