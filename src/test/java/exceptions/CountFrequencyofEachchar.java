package exceptions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CountFrequencyofEachchar {

	public static void main(String[] args) {
		
		String name="Mohammed Mohsin";
		name=name.toLowerCase();
				char[] ch=name.toCharArray();
				
				 Set<Character> set = new LinkedHashSet<>();
				 
					for(Character r:ch) {
						set.add(r);
						
					}
	
					System.out.println(set);

					StringBuilder sb=new StringBuilder();
					
					for(char c:set)
					sb.append(c);
					
					System.out.println(sb.toString());
					
					
	}
	}
