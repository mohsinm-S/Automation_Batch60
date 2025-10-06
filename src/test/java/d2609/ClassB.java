package d2609;

public class ClassB extends ClassA{

	
	ClassB()
	
	{
		this("MD");
		System.out.println("Method of Const B1");
	}
	ClassB(String name)
	{
		
		super(100);
		System.out.println("Method of class B2");
	}

	public static void mqb() {
		System.out.println("Method of class B");
	}
}
