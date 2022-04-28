package annotiation;

class Parent1
{
	@Deprecated
	void print()
	{
		System.out.println("Hey guys!");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Hurrah!");
	}
}
public class Exg3 {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.print1();

	}

}