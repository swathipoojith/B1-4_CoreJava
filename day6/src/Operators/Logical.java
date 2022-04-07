package Operators;

public class Logical {

	public static void main(String[] args) 
	{
		int a=1,b=7;
		boolean res= (a<b && b<8);
		boolean res1=(a<b || b>8);
		boolean res2= !(a<b);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}