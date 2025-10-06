package assignments;

public class Assignment3 {

	public static void main(String[] args) {
		add();
		subtrac();
		multi();
		div();
		mod();
		
		
	}
	public static void add() 
	{
		int a=5;
		long b=6;
		
		long sum=a+b;
		System.out.println("Sum of the a +b = "+sum);
		
	}

	public static int subtrac() 
	{
		int a=5;
		int b=6;
		
		int sum=a-b;
		//System.out.println("Subtarct of the a - b = "+sum);
		return sum;
	}
	
	public static void multi() 
	{
		int a=5;
		float b=6.5f;
		
		float mul=a*b;
		System.out.println("Mul of the a - b = "+mul);
	}

	public static void div() 
	{
		int a=5;
		double b=6;
		
		double div=a/b;
		System.out.println("div of the a - b = "+div);
	}

	public static void mod() 
	{
		int a=5;
		int b=6;
		
		int mod=a%b;
		System.out.println("mod of the a - b = "+mod);
	}
	
	
	
}
