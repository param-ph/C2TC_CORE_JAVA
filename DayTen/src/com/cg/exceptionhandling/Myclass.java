package com.cg.exceptionhandling;

public class Myclass {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z;
		try {
			z = x/y;
			System.out.println(z);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
