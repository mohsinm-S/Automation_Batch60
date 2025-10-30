package exceptions;

import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a/b;
	System.out.println(c);
	
	sc.close();
		}
	catch(ArithmeticException e) {
		try {
		System.out.println("Please enter correct input");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a/b;
	    System.out.println(c);
		}catch(Exception e2) {
			System.out.println(" please enter");
		}
	}finally {
		
	}
		
	}

}
