package com.org.copy;

import org.springframework.stereotype.Component;

@Component
public class BookAward implements Award  {

	
	
	public BookAward() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void award() {
		
		System.out.println("Book Award");
		
	}

}
