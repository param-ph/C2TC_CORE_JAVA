package com.cg.bank.framework;

public abstract class BankFactory { 
	public abstract SavingAcc getNewSavingAccount(int AccNo, String accNm, int accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(int AccNo, String accNm, int accBal, float creditlimit);
}
