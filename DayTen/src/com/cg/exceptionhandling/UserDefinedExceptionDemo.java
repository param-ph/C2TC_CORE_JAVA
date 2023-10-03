package com.cg.exceptionhandling;

import java.util.Scanner;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age and weight");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		Validation obj = new Validation();
		sc.close();
		
		try {
			obj.validate(age, weight);
			
		}catch(InvalidBloodDonateException e) {
			System.out.println(e);
		}
			System.out.println("rest of the code");
	}

}
