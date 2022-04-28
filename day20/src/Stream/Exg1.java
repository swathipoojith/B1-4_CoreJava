package Stream;
import java.util.*;
import java.util.stream.*;

public class Exg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>values=Arrays.asList(11,22,33);
		List<Integer>var=values.stream().map(i->i).collect(Collectors.toList());
		System.out.println(var);

	}

}