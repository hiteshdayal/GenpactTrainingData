package com.org.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {

	@Autowired
	@Qualifier("BookAward")
	private Award award;
	
	
	
	public FictionWriter() {
		super();
	}

	@Autowired
	public void printAward(Award award) {
		this.award = award;
	}
	
	@Override
	public void write() {
		System.out.println("write fiction method");
		
	}

	@Override
	public void getAward() {
		
		award.award();
		
	}

}
