package generics;

public class Exg2<T>
{
	T val;
	public void print()
	{
		System.out.println(val.getClass().getName());
	}

	public static void main(String[] args) {
		
		Exg2<Character>obj=new Exg2<>();
		obj.val='z';
		obj.print();
		
	}

}