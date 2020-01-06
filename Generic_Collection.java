
public class Generic_Collection {
	public static void main(String args[])
	{
		Dog<Double> d = new Dog<>();
		d.i = 4.0;
		d.printvalue();
		
	}
}

class Dog<T extends Number> 
{
	T i;
	void printvalue()
	{
		System.out.println(i);
	}
}