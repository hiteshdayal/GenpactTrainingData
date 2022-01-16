package com.org.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {

	@Autowired
	private Award award;
	
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
