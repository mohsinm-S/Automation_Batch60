package assignment2;

//WAP for Inheritance concept using extends keyword.
//Multi level  

class Vechicle 

{
	 static  void v1()
	{
		System.out.println("Vechicle class");
	}
}

class TwoWheeler extends Vechicle
{
	static void t1()
	{
		System.out.println("TwoWheeler Class");
	}	
}

class Bike extends TwoWheeler
{
	static void b1()
	{
		System.out.println("Bike Class");
	}
}

public class Assignment33  extends Bike{

	public static void main(String[] args) {
		
v1();
t1();
b1();
	}

}
