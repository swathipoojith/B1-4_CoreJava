package polymorphism;

class Base 
{
	void method1()
	{
		System.out.println("Krishna");
	}
}
class Derived extends Base
{
	void method1()
	{
		System.out.println("Swathi");
	}
}
class Parent
{
	
	public static void main(String[] args) {
		Base b=new Base();
		b.method1();
		Derived d=new Derived();
		d.method1();

	}

}