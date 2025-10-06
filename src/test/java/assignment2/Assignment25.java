package assignment2;

import java.util.Scanner;

public class Assignment25 {
	
	
//WAP to find area of circle, triangle and Square and Rectangle with help of Scanner class
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r vlaue : ");
		int r =sc.nextInt();
		
		// Area of circle
		
		double area=Math.PI*r*r;
		System.out.println("Area Of circle is : "+area);
		
		// Area of triangle 
		
		System.out.println("Enter b vlaue : ");
		int b =sc.nextInt();
		
		System.out.println("Enter h vlaue : ");
		int h =sc.nextInt();
		
		
		double areaofTriangle=0.5*b*h;
		System.out.println("Area of Triangle = "+areaofTriangle);
		
		
		// Area Of Square
		System.out.println("Enter a vlaue : ");
		int  a =sc.nextInt();
		
    	double AreaofSquare=a*a;
	    System.out.println("Area of Square ="+AreaofSquare);
	
		
		
		//Area of Rectangle
		System.out.println("Enter L vlaue : ");
		int l =sc.nextInt();
		
		System.out.println("Enter b vlaue : ");
		 b =sc.nextInt();
		
		double AreaofRectangle=l*b;
		System.out.println("Area of Rectangle ="+AreaofRectangle);
		
sc.close();
	}

}
