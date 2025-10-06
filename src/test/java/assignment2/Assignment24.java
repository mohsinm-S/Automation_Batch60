package assignment2;

import java.util.Scanner;

public class Assignment24 {
// WAP for Addition, Multiplication, Division and Subtraction, modulus WIth the help of Scanner class
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A vlaue : ");
		int a =sc.nextInt();
		System.out.println("Enter B vlaue : ");
		int b =sc.nextInt();
		
		int c=a+b;
		System.out.println("Addition of a abd B = "+c);
		
		
		int m=a*b;
		System.out.println("Multiplication a*b= "+m);
		
		int d=a/b;
		System.out.println("Division a/b= "+d);
		
		int s=a-b;
		System.out.println("Subtraction a-b= "+s);
		
		
		sc.close();
	}

	
	
}
