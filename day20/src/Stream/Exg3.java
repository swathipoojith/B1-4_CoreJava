package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>values=Arrays.asList(12,5,8,16);
		Optional<Integer>var=values.stream().reduce((a,b)->a+b);
		if(var.isPresent())
		{
			System.out.println("Result: "+var.get());
		}

	}

}