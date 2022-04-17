package collection;
import java.util.ArrayList;
public class Exg1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>(2);
		obj.add(10.0);
		obj.add("Swa");
		obj.add(5);
		obj.add('c');
		System.out.println(obj);

	}

}