
package application;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	

	public MMSavingAccAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
		
	}
	
	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
	
	

}