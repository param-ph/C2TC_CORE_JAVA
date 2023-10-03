package com.cg.exceptionhandling;

public class Problem2  {
	public void test(String s, String x) throws InvalidDirectionException{
	if(s.equalsIgnoreCase(x)) System.out.println("You are going in correct direction");
	else
		throw new InvalidDirectionException("you are going in wrong directionYou are going in correct direction");
	
	}
}
