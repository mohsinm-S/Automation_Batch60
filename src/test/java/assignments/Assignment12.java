package assignments;

import java.util.Scanner;

public class Assignment12 {
// WAP to check condition statements switch statements
	public static void main(String[] args) {
	System.out.println("Please Enter Number : =");
	
	Scanner sc =new Scanner(System.in);
	
   	int days=	sc.nextInt();
	
    sc.close();
		
	//int days =1;
	
	switch(days) {
	
	case 1:  
		
		System.out.println(" Week day is Monday");
		
	break;
	
	case 2:
		
		System.out.println("Week day is Tuesday");
		
	break;
	
	case 3:
		
		System.out.println("Week day is Wednessday");
		
	break;
	
	
	case 4:
		
		System.out.println("Week day is Thursday");
		
	break;
		
	case 5:
		
		System.out.println(" Week day is Friday");
		
	break;
		
	case 6:
		
		System.out.println("Week day is Saturday");
		
	break;
	
    case 7:
		
		System.out.println(" Week day is Sunday");
		
	break;
	
	default :
		System.out.println("Please enter valid week day");
		break;
	}

	}

}
