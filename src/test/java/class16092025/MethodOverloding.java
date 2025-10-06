package class16092025;

public class MethodOverloding {

	public void add() 
	{
		System.out.println("Method 1");
		
	}
	
	public void add(int a)
	{
		System.out.println("method 2");
	}
	public void add(int a,int b)
	{
		System.out.println("Metod 3");
	}
	
	public void add(String name) 
	{
		System.out.println("method 4");
	}
	
	public static void main(String[] args) {
		MethodOverloding mo=new MethodOverloding();
		mo.add();
		mo.add(100);
		mo.add("Mohsin");
		mo.add(15, 362);
	}
	
}
