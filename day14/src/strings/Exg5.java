package strings;
import java.util.Scanner;
public class Exg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		//System.out.println(str1.length());
		//System.out.println(str1.charAt(3));
		//System.out.println(str1.toLowerCase());
		System.out.println(10+20+"hello"+"world"+10+20);
		System.out.println(str1.concat(str2));
		s.close();
	}

}