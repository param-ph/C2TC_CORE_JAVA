package com.cg.exceptionhandling;

public class FinallyBlockExOne {
	
	public void divide (int a, int b) {
		try {
			System.out.println("-------within try block-------");
			int result = a/b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticExceptionCaught: " + e.getMessage());
		}
			finally {
				System.out.println("in Finally block");
			}
		System.out.println("Statement after the finally");
			
		}
		
	}

