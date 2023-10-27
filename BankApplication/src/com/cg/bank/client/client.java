package com.cg.bank.client;
import com.cg.bank.application.MMBankFactory;
import com.cg.bank.application.MMCurrentAcc;
import com.cg.bank.application.MMSavingAcc;
import com.cg.bank.framework.BankFactory;
import com.cg.bank.framework.CurrentAcc;
import com.cg.bank.framework.SavingAcc;
public class client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(1, "Param", 10000, false);
		sa.withdraw(sa.getAccBal());
		CurrentAcc ca = new MMCurrentAcc(2, "Akash", 20000, 50000);
		ca.withdraw(ca.getCreditLimit());
		

	}

}
