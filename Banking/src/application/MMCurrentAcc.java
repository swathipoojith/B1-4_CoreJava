package application;
import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("MMCurrent [toString()=%s]", super.toString());
	}
	
	
	

}