package regex;

import java.util.regex.Pattern;

public class Exg3 {

	public static void main(String[] args) {
		String str="I1love2India";
		String delimiter="\\d";
		Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String[] res=p.split(str);
		
		for(String i:res)
		{
			System.out.println(i);
		}
		
		

	}

}