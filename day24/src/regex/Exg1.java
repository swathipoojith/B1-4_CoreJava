package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exg1 {

	public static void main(String[] args) {
		String pattern="Swathi Krishna";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		
		boolean Result=Pattern.matches(pattern, input);
		System.out.println(Result);

	}

}