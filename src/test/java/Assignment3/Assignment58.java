package Assignment3;

import java.util.Arrays;

// WAP to check if String is Anagram

public class Assignment58 {

	public static void main(String[] args) {
		
		String a="saw";
		String b="was";
		
		if(a.length()!=b.length()) {
			System.out.println("Not a Anagrame");
		}else {
			
			char ch1[]=a.toCharArray();
			char ch2[]=b.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		boolean b1=	Arrays.equals(ch1, ch2);
			if(b1) {
				System.out.println("Its Anagram");
			}else {
				System.out.println("Not a Anagrame");
			}
			
		}

	}

}
