package class16092025;

public class Amazon {
	
	Amazon()   // Constroctor overloding 
	{ 
	
		System.out.println("Constroctor Amazon 1");
		
	}
	
	
	Amazon(int a)
	{
    System.out.println("Value of a = "+a);
    }

	
	Amazon(int a,int b)
	{
		int sum =a+b;
		System.out.println("Sum of the two num"+sum);
	}
	Amazon(String c)
	{
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		new Amazon();
		new Amazon(200);
		new Amazon(45,6);
		new Amazon("Mohsin");
	}
	
}
