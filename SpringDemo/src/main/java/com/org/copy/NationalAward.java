package com.org.copy;

import org.springframework.stereotype.Component;

@Component
public class NationalAward implements Award {

	@Override
	public void award() {

		System.out.println("National Award");
	}

}
