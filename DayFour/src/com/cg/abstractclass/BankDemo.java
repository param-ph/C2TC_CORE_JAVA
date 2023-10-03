package com.cg.abstractclass;

public class BankDemo {

	public static void main(String[] args) {
		Bank a = new SBI();
		Bank b= new HDFC();
		int x = a.rateOfinterest();
		System.out.println("rate of interest=" + x);

	}

}
