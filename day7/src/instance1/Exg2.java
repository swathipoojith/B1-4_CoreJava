package instance1;

class Parent
{
	
}
class Child extends Parent
{
	
}

public class Exg2 {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c instanceof Parent);

	}

}