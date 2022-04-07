package day6;

	class Exg2
	{
		final void display()
		{
			System.out.println("Hello Students");
		}
	}
	public class Exg2 extends Exg2
	{
		 
		
		void eat()
		{
			
			System.out.println("Welcome to C2TC");
		}

		public static void main(String[] args) 
		{
			Exg2 e=new Exg2();
			e.display();

		}

	}
