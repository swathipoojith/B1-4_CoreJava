package this1;

public class Exg3 {

	void print(Exg3 e)
	{
		System.out.println("I love biryani");
	}
	void display()
	{
		print(this);
	}

	public static void main(String[] args) {
		Exg3 e=new Exg3();
		e.display();

	}

}