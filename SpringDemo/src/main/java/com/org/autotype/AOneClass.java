package com.org.autotype;

public class AOneClass {
	BOneClass b;

	public AOneClass() {
		super();
		System.out.println("Class A");
	}

	public BOneClass getGet() {
		return b;
	}

	public void setB(BOneClass b) {
		this.b = b;
	}

	void PrintName() {
		System.out.println("Hello AOneClass");
	}

	public void display() {
		PrintName();
		b.printName();
	}

}