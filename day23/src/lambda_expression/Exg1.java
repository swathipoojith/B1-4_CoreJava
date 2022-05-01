package lambda_expression;

interface A
{
	void show();
}
public class Exg1 {

	public static void main(String[] args) 
	{
		A obj=()->
		{
			System.out.println("Welcome to Lambda Expression");

		};
		obj.show();
	}
}

	
