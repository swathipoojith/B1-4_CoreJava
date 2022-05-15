


package application;
import framework.NormalAcc;

public class GsNormalAcc extends NormalAcc {

	public GsNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("GSNormalAcc [toString()=%s]", super.toString());
	}
	
	
	

}