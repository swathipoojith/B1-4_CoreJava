package collection;
import java.util.LinkedList;
public class Exg3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList<>();
		obj.add(50);
		obj.add("Swa");
		obj.add(30.0);
		obj.add(40);
		System.out.println(obj);
		obj.addFirst(5);
		obj.addLast(25);
		
		System.out.println(obj);
		System.out.println(obj.size());
		LinkedList obj1=new LinkedList<>();
		obj1.add("Swa");
		obj1.add("Shobha");
		obj1.add("Krishna");
		obj.addAll(2,obj1);
		System.out.println(obj);
		

	}

}