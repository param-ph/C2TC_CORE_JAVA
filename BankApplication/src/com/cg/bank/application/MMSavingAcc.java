package com.cg.bank.application;

import com.cg.bank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float minBal = 500.0F;
	
	
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	public void withdraw(float accBal) {
		System.out.println("The amount is debited succefulluy and remaining balance is: " + accBal + " and minimum balance: " + minBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

}
