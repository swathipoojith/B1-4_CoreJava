package application;

import framework.*;



public class MMBankFactory extends BankFactory{
	
	
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float charges,boolean isSalary) {
		MMSavingAcc p=new MMSavingAcc(AccNo,accNm,accBal,isSalaried);
		return p;
	}
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float charges,float creditLimit) {
		MMCurrentAcc n=new MMCurrentAcc(AccNo,accNm,accBal,creditLimit);
		return n;
	}
}