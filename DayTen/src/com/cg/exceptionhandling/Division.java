package com.cg.exceptionhandling;

import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public static void divide() {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		try {
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;   
		System.out.println("Division is = "+c);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
