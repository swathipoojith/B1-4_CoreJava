package recursion;
import java.util.Scanner;

public class Exg2 {
	  int sum = 0;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        n = s.nextInt();
	        Exg2 obj = new Exg2();
	        int a = obj.add(n);
	        System.out.println("Sum:"+a);
	    }
	    int add(int n)
	    {
	        sum = n % 10;
	        if(n == 0)
	        {
	        	 return 0;
	        }
	        else
	        {
	             return sum + add(n / 10);
	        }
	 
	    }
	}
	        
