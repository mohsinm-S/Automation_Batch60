package d23092025;

import java.util.Random;

import lombok.ToString;

public class Randomclass {

	private final static String alphabet="abcdefghijklmnopqrstuvwxyz";
	private final static String alphanumeric="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	
	private final static String Number="1234567890";
	
	private static Random rm=new Random();
	private static StringBuilder sb=new StringBuilder();
	
	static String name(int length) {
		
           		
		for(int i=0;i<length;i++) {
			
			int index= rm.nextInt(alphabet.length());
			sb.append(alphabet.charAt(index)).toString();
			
		}
		
		//System..outerr.println(name);
		return sb.toString();
	}
	
	
	static String phonenumber(int a) {
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a;i++) {
		int intdex =rm.nextInt(Number.length());
		sb.append(intdex);
		}
		return sb.toString();
	}
	
	static String Password(int length) {
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<length;i++) {
		 int index =rm.nextInt(alphanumeric.length());
		sb.append(alphanumeric.charAt(index));
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
	 
		System.out.println("Nmae = "+name(8));
System.out.println("Phone number = "+phonenumber(10));
System.out.println("Password = "+Password(16));

	}

}
