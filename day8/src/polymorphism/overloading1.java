package polymorphism;

public class overloading1 {


		void assign(float a,float b)
		{
			System.out.println("Area of Rectangle: "+(float)(a*b) );
		}
		void assign(int a,int b)
		{
			System.out.println("Area of Rectangle: "+(a*b) );
		}
		
		

		public static void main(String[] args) {
			overloading1 o=new overloading1();
			o.assign(5f,10f);
			o.assign(10, 20);

		}

	}