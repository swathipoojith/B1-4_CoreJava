package strings;
import java.util.Scanner;
public class Exg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Dhoni";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("Matching");
			
		}
		else
		{
			System.out.println("Not Matching");
		}
		s.close();

	}

}