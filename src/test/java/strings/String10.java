package strings;

import java.util.Arrays;
import java.util.Scanner;

public class String10 {
 public static void main(String[] args) {
	
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Please enter lenth of the array -->>");
	 
        int[] rollno=new int[sc.nextInt()];

        for(int i=0;i<rollno.length;i++) {
        
        	System.out.println("Please enter index of  -->"+i);
        rollno[i]=sc.nextInt();
        
        }
    String output=   Arrays.toString(rollno);
    
           System.out.println(output);
	
}
}
