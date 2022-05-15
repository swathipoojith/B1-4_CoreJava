package application;

import framework.*;

public class GsshopFactory extends ShopFactory{
	
	
	public GsPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		GsPrimeAcc p=new GsPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	
	public GsNormalAcc getNewNormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		GsNormalAcc n=new GsNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}



}