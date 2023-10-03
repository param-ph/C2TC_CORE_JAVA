package com.cg.exceptionhandling;

public class TryCatchExample {
	static void performDivision(int x, int y) {
		System.out.println("i am a method");
		int z;
		try {
			System.out.println("i am in try block");
			z=x/y;
			System.out.println(z);
		}
		catch(Exception e) {
			System.out.println("i am in catch block" + e);
		}
	}
	

}
