package strings;

import java.util.Arrays;
import java.util.Scanner;

public class String13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter String array length == ");
		String[] animal=new String[sc.nextInt()];
		
		for(int i=0;i<animal.length;i++) {
			
			System.out.println("Please enter animal name "+ i);
			animal[i]=sc.next();
			
		}
		
		System.out.println(Arrays.toString(animal));
		

	}

}
