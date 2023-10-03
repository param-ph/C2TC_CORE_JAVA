package com.cg.interfaces;

public class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("FirstInterface");
	}
	public void myMoreMethod() {
		System.out.println("SecondInterface");
	}
}
