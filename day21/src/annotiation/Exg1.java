package annotiation;


	class Parent
	{
		void eatFood()
		{
			System.out.println("Parent class");
		}
	}
	class Child extends Parent
	{
		@Override
		void eatFood()
		{
			System.out.println("Child class");
		}
	}
	public class Exg1 {

		public static void main(String[] args) {
			Parent c=new Child();
			
			c.eatFood();

		}

	}