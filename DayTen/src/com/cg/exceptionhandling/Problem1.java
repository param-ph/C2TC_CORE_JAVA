package com.cg.exceptionhandling;

import java.util.Scanner;

// class Main1 {
//	static void splitString(String text) {
//		try {
//		String[] splittedString = text.split("/");
//	for(int i=0;i<splittedString.length; i++) {
//			System.out.println("Splitted string at index:"+i+"is"+splittedString[i]);
//			}
//		}catch(Exception e){
//			System.out.println("Exception"+e);
//		}
//	finally {System.out.println("inside finally block");
//		}
//}
//	
//	}

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the string input");
		String text=sc.nextLine();
		sc.close();
		Main obj = new Main();
		if(text.length()>2) {
			obj.splitString(text);
		}
		else
			obj.splitString(null);
	}

}
