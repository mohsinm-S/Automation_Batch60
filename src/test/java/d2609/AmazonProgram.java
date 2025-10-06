package d2609;

public class AmazonProgram {
	
	AmazonProgram(int a)
	{
		System.out.println("Constructor 1");
	}
	
	AmazonProgram(double d)
	{
		this(100);
	System.out.println("Constructor 2");
	}
	AmazonProgram(String name){
		this();
	
	System.out.println("Constructor 3");
	}
	AmazonProgram(){
		this(2.5);
	System.out.println("Constructor 4");
	}	
	
	public static void main(String[] args) {
	new AmazonProgram("mohsin");

	}

}
