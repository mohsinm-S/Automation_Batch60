package assignment2;


import java.util.Scanner;

public class Assignment32 {

	

	// "WAP to do addition of 2 number from 10 student 	means->10 student should use the same program to do addition.
	// 10 student should use the same calculator"
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Enter A value =");
			int a=sc.nextInt();
			System.out.println("Enter B value =");
			int b=sc.nextInt();
			
			double c=a+b;
			System.out.println("Student-"+i+"-Sum="+c);
			
		}
		
		
		
		
		
		sc.close();

	}

}
