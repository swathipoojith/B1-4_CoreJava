package this1;

public class Exg4 {

	String str;
	Exg4()
	{
		str="Swathi";
	}
	Exg4 get()
	{
		return this;
	}
	void display()
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		Exg4 e=new Exg4();
		e.get().display();

	}

}