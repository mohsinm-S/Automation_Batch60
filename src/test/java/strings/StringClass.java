package strings;

import java.util.Random;
import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Please enter Meaage");
		 String message = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	     Random rm = new Random();
        	int a=	rm.nextInt(100);
    	
    	StringBuilder sb= new StringBuilder();
    	
	for(int i=0;i<8;i++) {
    	int index=rm.nextInt(message.length());
	
     sb.append(message.charAt(index));
           	}
          		
	String Email=	(sb.toString()+a+"@gmail.com");
		
	System.out.println(Email);
		
	}
	}


