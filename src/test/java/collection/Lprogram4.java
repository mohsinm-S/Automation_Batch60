package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lprogram4 {

	public static void main(String[] args) {
	//	Find Frequency of each element
		
		String name ="mohammed mohsin";
		
		char[] ch=name.toCharArray();
		
		List<Character> chlist= new ArrayList<>();
		
		for(Character c:ch) {
			chlist.add(c);
			
		}
		
		System.out.println(chlist);
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(Character ch2:chlist) {
			map.put(ch2, map.getOrDefault(ch2, 0)+1);
			
		}
System.out.println(map);
	}

}
