package com.org.SpringDemo;

public class HelloWorldService {

	private String name;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String infoData() {
		return "Hello "+name+" Your address is"+address;
	}
	
	
	
}
