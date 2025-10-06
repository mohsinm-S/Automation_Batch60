package assignment2;

import java.util.Scanner;

public class Assignment26 {
// WAP to find circumference of circle, triangle and Square and Rectangle with help of Scanner class
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius vlaue : ");
		int radius =sc.nextInt();
		
		double circumferenceOfCircle=2*Math.PI*radius;
		System.out.println("circumference Of Circle ="+circumferenceOfCircle);
		
		//circumference Of triangle
		
		System.out.println("Enter a vlaue : ");
		int a =sc.nextInt();
		System.out.println("Enter b vlaue : ");
		int b =sc.nextInt();
		System.out.println("Enter c vlaue : ");
		int c =sc.nextInt();
		
		double circumferenceOftriangle =a+b+c;
		System.out.println("circumference Of triangle ="+circumferenceOftriangle);
		
		///circumference Of square
		///
		System.out.println("Enter a vlaue : ");
		double a1 =sc.nextDouble();
		
		double circumferenceOfsquare=4*a1;
		System.out.println("circumference Of square ="+circumferenceOfsquare);
		
		
		///circumference Of Rectangle

		System.out.println("Enter length  vlaue : ");
		double length  =sc.nextDouble();

		System.out.println("Enter breadth vlaue : ");
		double breadth =sc.nextDouble();
		
		double circumferenceOfRectangle=2*(length+breadth);
		
		System.out.println("circumference Of Rectangle ="+ circumferenceOfRectangle);
		
		
sc.close();
	}

}
