package Stream;
import java.util.Arrays;
import java.util.List;

public class Exg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>values=Arrays.asList(11,22,33,22,60,25,11);
		values.stream().filter(i->i<30).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println("Unique values are" +i));
		values.stream().limit(5).forEach(i->System.out.println(i));
		values.stream().sorted().forEach(i->System.out.println(i));
	}

}