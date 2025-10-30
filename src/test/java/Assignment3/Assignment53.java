package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

//WAP to assign the value of Array at run time
public class Assignment53 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter size of the array");
		
		int a[] =new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
			
			
		}
		
		String output= Arrays.toString(a);
		System.out.println(output);

	}

}
