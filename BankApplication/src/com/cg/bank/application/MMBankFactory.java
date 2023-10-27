package com.cg.bank.application;

import com.cg.bank.framework.BankFactory;
import com.cg.bank.framework.CurrentAcc;
import com.cg.bank.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, int accBal, boolean isSalaried) {
		MMSavingAcc mmsa = new MMSavingAcc( AccNo,  accNm,  accBal,  isSalaried);
		return mmsa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, int accBal, float creditlimit) {
		MMCurrentAcc mmca = new MMCurrentAcc( AccNo,  accNm,  accBal,  creditlimit);
		return mmca;
	}

	


	

}
