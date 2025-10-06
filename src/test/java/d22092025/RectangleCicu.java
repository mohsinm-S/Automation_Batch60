package d22092025;

import java.util.Scanner;

public class RectangleCicu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter L value");
		int l=sc.nextInt();
		System.out.println("Please enter b value");
		int b=sc.nextInt();

		int rc=2*(l+b);
		System.out.println("Rectangler circu = "+ rc);
		sc.close();
	}

}
