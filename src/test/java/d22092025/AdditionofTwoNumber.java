package d22092025;

import java.util.Scanner;

public class AdditionofTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			System.out.println("Student"+i +":Please enter A  numbers :");
			int a =sc.nextInt();
			System.out.println("Student"+i +":Please enter B  numbers :");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Student : "+i+"Total :"+c);
			
			
		}
		sc.close();
	}

}
