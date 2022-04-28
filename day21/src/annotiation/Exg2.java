package annotiation;


	import java.util.ArrayList;

	public class Exg2 {

		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			@SuppressWarnings("rawtypes")
			ArrayList a=new ArrayList<>();
			a.add(10);
			a.add("Soujan");
			System.out.println(a);

		}

	}