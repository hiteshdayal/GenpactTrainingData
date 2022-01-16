package com.org.copy;

import org.springframework.stereotype.Component;

@Component
public class PulitzerAward implements Award {

	@Override
	public void award() {
		System.out.println("Pulitzer Award");
		
	}

	
	
}
