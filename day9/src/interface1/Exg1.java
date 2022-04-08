package interface1;
public interface Exg1
{
	void display();
	void print();
	
}

class Main1 implements Exg1
	{
		public void display() 
		 {
			 System.out.println(" Hi Sunil");
		 }
		public void print()
		{
			System.out.println(" Hi Nikitha");
		}
		 public static void main(String args[])
		 {
			 Main1 m=new Main1();
			 m.display();
			 m.print();
			
		}
}