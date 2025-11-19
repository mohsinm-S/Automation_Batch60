package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProgram4 {

	public static void main(String[] args) {
		
		String name="mohammed mohsin";
		
		char ch[]=name.toCharArray();
		
		List<Character> list=new ArrayList<>();
		
		for(Character c:ch) {
			
			list.add(c);
		}
		System.err.println(list);
		
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(Character f:list) {
			map.put(f, map.getOrDefault(f, 0)+1);
			
		}
		System.out.println(map);
	}
	
}
