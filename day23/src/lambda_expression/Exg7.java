package lambda_expression;

public class Exg7
{

	public static void main(String[] args) 
	{
				
		Runnable r1=()->
		{
			System.out.println("Class Name is: Swathi");
		};
		Thread t=new Thread(r1);
		t.start();
	}
}
		
						
			