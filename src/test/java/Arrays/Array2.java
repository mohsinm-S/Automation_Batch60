package Arrays;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		
	

	String animal[]= {"Dog","Cat","Pig"};
	
	String birds[]=new String[animal.length];
	
	for(int i=0;i<animal.length;i++) {
		
		birds[i]=animal[i];
	}
	System.out.println(Arrays.toString(birds));
        } 
 	 }
