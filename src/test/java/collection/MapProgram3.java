package collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram3 {
	public static void main(String[] args) {
		
		Map<Integer ,String> m = new HashMap<>();
		
		m.put(1, null);
		m.put(2, "Mohsin");
		m.put(3, "Khan");
		m.put(4, "Rahim");
		m.put(5, "Raju");
		System.out.println(m);
		
		System.out.println(m.get(2));
		
		for(Integer key : m.keySet())
		{
			if(key.equals(2)) {
				System.out.println(m.get(key));
			}
			
		}
	}

}
