package Assignment3;

import java.util.Arrays;
//"WAP to copy the value of one array into another array in reverse orderInput=[1,2,3,4,5]
// Output=[5,4,3,2,1]"
import java.util.Scanner;

public class Assignment56 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter size of the array");
		
		int st1[]=new int[sc.nextInt()];
		
		for(int i=0;i<st1.length;i++)
		{
		st1[i]=sc.nextInt();	
		}
		
		int st2[]=new int[st1.length];
		
		for(int k=0,j=st2.length-1;k<st2.length;k++,j--)
		{
			st2[j]=st1[k];
			
		}
		
		System.out.println(Arrays.toString(st1));
		System.out.println(Arrays.toString(st2));

	}

}
