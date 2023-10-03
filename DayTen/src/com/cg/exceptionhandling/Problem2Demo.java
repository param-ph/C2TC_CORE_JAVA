package com.cg.exceptionhandling;

import java.util.Scanner;

public class Problem2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the house direction");
		String houseDirection = sc.next();
		System.out.println("Enter the GPS Direction");
		String GpsDirection = sc.next();
		Problem2 obj = new Problem2();
		sc.close();
		try {
		obj.test(houseDirection, GpsDirection);
		}
		catch(InvalidDirectionException e) {
			System.out.println("Exception occured"+ e);
		}

	}

}
