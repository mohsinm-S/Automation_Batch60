package exceptions;

import java.util.Scanner;

public class RuntimeExceptions {

	public static void main(String[] args) {
		
		int [] a= new int[2];
		
		a[0]=1;
		a[1]=2;
	  //  a[2]=3; ArrayIndexOutofBoundarsexcepion 
		
		Scanner sc=new Scanner(System.in);
		int aa=sc.nextInt();//inputMissmatchEceptions
		
		int a1=5;
		int b=0;
		//int c=a1/b; ArthmeticExcepions
		
		String name="";
		
		//char a2=name.charAt(2); //StringIndexOutOfBoundsException
		
		String n1=null;
		//n1.isBlank(); NullPointerException
		
		
		
				
		

	}

}
