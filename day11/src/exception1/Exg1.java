package exception1;
import java.util.Scanner;
public class Exg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		try
		{
			int res=a/0;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Exception handling in Java");
		}
		
		s.close();

	}

}