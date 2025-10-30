package Assignment3;

import java.util.Arrays;

// WAP to check if the 2 arrays are equals
public class Assignment55 {

	public static void main(String[] args) {
		int a1[]= new int[5];
		a1[0]=1;
		
		
		int a2[]=new int[5];
		a2[0]=1;
		
		if(Arrays.equals(a1,a2)) {
			System.out.println("both arrays are equal");
		}else {
			System.out.println("Boath arrays are not equal");
		}

	}

}
