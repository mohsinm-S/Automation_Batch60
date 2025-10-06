package assignment2;

// WAP using this calling statement:
public class Assignment35 {
	
	Assignment35(int a)
	{
		System.out.println("This calling statement 1" +a);
	}
	
	Assignment35()
	{
		this("mohsin");
		System.out.println("This calling statement 2");
	}
	
	Assignment35(String name)
	{
		this(121);
		System.out.println("This calling statement 3 "+name);
	}
	

	public static void main(String[] args) {
		new Assignment35();
		

	}

}
