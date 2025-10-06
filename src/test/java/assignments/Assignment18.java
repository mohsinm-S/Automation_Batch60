package assignments;

public class Assignment18 {

	//WAP for Method Overloading(static/non static methods)
	
	public void add()
	{
		int a=5;
		int b=10;
		System.out.println("Addition in non ststic method "+(a+b));
	}
	public void add(int a,int b,double c)
	{
		double d=a+b+c;
		System.out.println("Addition of 3 Variables  ="+d);
		
	}
	
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("static method= "+c);
		
	}
	
	public static void add(int a,float b)
	{
		double d=a+b;
		System.out.println("stattic value= "+d);
	}
	
	
	public static void main(String[] args) {
		
		add(5,6);             //static method accessing  
		add(85,5.5f);
		
		Assignment18 a18=new Assignment18();
		
	        a18.add();                    // Non static method accessing  
	    	a18.add(45,5,5.5);

	}

}
