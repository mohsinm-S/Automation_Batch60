package d22092025;

import java.util.Scanner;

public class AddScannerClass {

	public static void main(String[] args) {
	
		Scanner sc1=new Scanner(System.in);
		System.out.println("Please Eneter A and B Value for Addition ");
				int a=	sc1.nextInt();
				int b=	sc1.nextInt();	
	 
				int c=a+b;
				System.out.println("Total ="+c);
	 
				System.out.println("Please Eneter A and B Value for Multi ");
				int a2=	sc1.nextInt();
				int b2=	sc1.nextInt();	
	 
				int c2=a2*b2;
				System.out.println("Total ="+c2);
		
				System.out.println("Please Eneter A and B Value for Div ");
				int a1=	sc1.nextInt();
				int b1=	sc1.nextInt();	
	 
				int c1=a1/b1;
				System.out.println("Total ="+c1);
	 sc1.close();

	}

}
