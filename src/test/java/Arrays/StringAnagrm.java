package Arrays;

import java.util.Arrays;

public class StringAnagrm {

	public static void main(String[] args) {
		String c1="Angle";
		String c2= "Egle";
		
		if(c1.length()!=c2.length()) {
			
			System.out.println("Not a Anagrame");
		}else {
			
			char [] ch1=c1.toCharArray();
			char [] ch2=c2.toCharArray();
			
			Arrays.sort(ch1);
		    Arrays.sort(ch2);
		   
		   System.out.println(Arrays.toString(ch1));
		   System.out.println(Arrays.toString(ch2));
		   
		   
			boolean b1=Arrays.equals(ch1,ch2);
			if(b1) {
				System.out.println("Both are equal and anagrame" );
			}else {
				System.out.println("Both are not equal and not anagram");
			}
			
			
		}
		
	

	}

}
