package this1;

public class Exg2 {

int a,b;
	
	void display(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void print()
	{
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
	}
	
	public static void main(String[] args) {
		Exg2 e=new Exg2();
		e.display(100, 200);
		e.print();

	}

}
