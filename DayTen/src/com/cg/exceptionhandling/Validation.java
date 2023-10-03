package com.cg.exceptionhandling;

public class Validation {
	public  void validate (int age, int weight) throws InvalidBloodDonateException {
		if(age<18 || weight < 65)
			throw new InvalidBloodDonateException ("Not eligible");
		else
			System.out.println("You are eligible to donate blood");
	}

}
