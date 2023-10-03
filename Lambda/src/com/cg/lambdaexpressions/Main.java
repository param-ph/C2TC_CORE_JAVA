package com.cg.lambdaexpressions;

public class Main {

	public static void main(String[] args) {
//		Implimentable imp = new Implimentable();
//		imp.display();
		
		Inf1 obj = () -> {
			System.out.println("i am a display method");
			System.out.println("i am a display method in a functinal interface");
		};
		obj.display();
	}
	 
}
