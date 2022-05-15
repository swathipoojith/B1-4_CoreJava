package application;

import framework.PrimeAcc;

public class GsPrimeAcc extends PrimeAcc{
	

	public GsPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
		
	}
	
	@Override
	public String toString() {
		return String.format("GSPrimeAcc [toString()=%s]", super.toString());
	}
	
	

}