package enum1;

interface Pizza
{
	public void print();
}
enum size implements Pizza
{
	small,medium,large,extralarge;
	public void print()
	{
		System.out.println("Size is: "+this);
	}
}
public class Exg4 {

	public static void main(String[] args) {
		size.extralarge.print();

	}

}