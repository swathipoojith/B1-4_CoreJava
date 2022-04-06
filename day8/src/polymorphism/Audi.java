package polymorphism;

public class Audi {

	String color;
	int speed;
	Audi()
	{
		System.out.println("I bought Audi in 2022");
	}
	Audi(String color,int speed )
	{
		this.color=color;
		this.speed=speed;
		
	}

	public static void main(String[] args) {

		Audi r=new Audi();
		Audi r1=new Audi("Black",50);
		System.out.println(r1.color+" "+r1.speed);
		

	}

}