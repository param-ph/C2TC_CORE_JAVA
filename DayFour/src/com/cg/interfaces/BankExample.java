package com.cg.interfaces;

public class BankExample {

	public static void main(String[] args) {
		Bank a = new SBI();
		Bank b = new HDFC();
		 float x = a.rateOfInterest();
		 System.out.println("rate of interest=" + x);
	}

}
