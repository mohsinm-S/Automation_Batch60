package Test123;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
			System.out.println("Enter Week day Starting letter");
		String day=sc.next();
		
		
		switch(day ) {
		case "M":System.out.println("Monday");
		break;
		case "T":System.out.println("Tuesday");
		break;
		case "W":System.out.println("Wednessday");
		break;
		case "TH":System.out.println("Thusday");
		break;
		case "F":System.out.println("Friday");
		break;
		case "S":System.out.println("Sataturday");
		break;
		case "SU":System.out.println("Sunday");
		default :
			System.out.println("No weekday selected");
		
		}
	sc.close();
	}

}
