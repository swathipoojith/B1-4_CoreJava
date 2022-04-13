package multithreading;

public class Exg1 extends Thread
		{
			public void run()
			{
				System.out.println("My name is Swathi");
			}

			public static void main(String[] args) 
			{
				Exg1 e=new Exg1();
				e.start();

			}

		}