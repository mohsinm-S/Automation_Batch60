package Assignment3;

//WAP on Access Specifier for methods within the class

public class Assignment42 {

	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("public= "+c);
	}
	
	private static void add(double a  , int b) 
	{
		double  c=a+b;
		System.out.println("private ="+c);
	}
	
	void add(String name)
	{
		System.out.println("Default ="+name);
	}
	
	protected void add4()
	{
		
		int a=45,b=5;
		long c=a/b;
		System.out.println("Protected ="+c);
	}
	
	public static void main(String[] args) {
		Assignment42 a42=new Assignment42();
		a42.add(4, 6);
		a42.add("Mohsin");
		a42.add4();
		add(45.25, 5);

	}

}
