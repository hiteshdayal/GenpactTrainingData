package com.org.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer {

	@Autowired
	private Award award;
	
	@Autowired
	public void printAward(Award award) {
		this.award = award;
	}
	
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
