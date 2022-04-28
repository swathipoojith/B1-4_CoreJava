package junittesting;
import org.junit.jupiter.api.BeforeAll;


import org.junit.jupiter.api.Test;
public class Exg4 {

	@BeforeAll
	static void display()
	{
		System.out.println("Swathi");
	}
	
	@Test
	void display1()
	{
		System.out.println("Poojith");
	}
}