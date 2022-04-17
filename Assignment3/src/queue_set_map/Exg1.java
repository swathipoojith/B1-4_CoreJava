package queue_set_map;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Exg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(23, "Swathi");
		s.put(15, null);
		System.out.println(s);
		System.out.println(s.lastEntry());


	}

}