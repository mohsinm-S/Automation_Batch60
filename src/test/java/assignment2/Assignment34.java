package assignment2;
//WAP using super calling statement:

class ClassA
{
	ClassA(int a)
	{
	System.out.println("Class A constructor "+a);
	}
	
}

class ClassB extends ClassA
{
	ClassB(String name)
	{
		super(100);
		System.out.println("Class B Constructor ");
	}
}

public class Assignment34 extends ClassB {

	Assignment34()
	{
		super("Mohsin");
		System.out.println("Assignemnt Constroctor");
	}
	public static void main(String[] args) {
		new Assignment34();

	}

}
