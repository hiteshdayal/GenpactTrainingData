package com.org.Beans;

public class User {

	String name;
	String address;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + "]";
	}
	
	
}
