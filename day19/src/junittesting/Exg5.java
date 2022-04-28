package junittesting;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
public class Exg5 {

	@Test
	void accept()
	{
		System.setProperty("1", "Swathi");
		Assumptions.assumeFalse("Swathi".equals(System.getProperty("2")));
		
	}

}