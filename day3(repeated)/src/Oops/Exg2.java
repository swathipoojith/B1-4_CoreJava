package Oops;

class CellPhones
{
	void message()
	{
		System.out.println("Hi, Swathi");
	}
	void call()
	{
		System.out.println("I am calling Poojith");
	}
}
class SamsungGalaxyM31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("PUB-G");
	}
}
public class exg2
{

	public static void main(String[] args)
	{
		OnePlus o=new OnePlus();
		o.games();
		o.message();
		o.call();
		SamsungGalaxyM31 m=new SamsungGalaxyM31();
		m.facelock();


	}

}