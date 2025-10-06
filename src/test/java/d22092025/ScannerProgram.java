package d22092025;

import java.util.Scanner;

public class ScannerProgram {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Eneter Properties Name: ");
		String name =sc.next();
		System.out.println(name);
		System.out.println("Please Enter Number =");
		int a = sc.nextInt();
		
		double area= a*a;
		
		System.out.println(area);
		sc.close();
	}

}
