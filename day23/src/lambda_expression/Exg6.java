package lambda_expression;

interface D
{
	int mul(int x,int y);
}
public class Exg6 {

	public static void main(String[] args) {
		D obj=(x,y)->(x*y);
		System.out.println(obj.mul(20, 30));

	}

}