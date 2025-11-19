package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapprog1 {
	public static void main(String[] args) {
		
		
		Map<Integer,String> m1 =new HashMap<>();
		
		m1.put(1,"Naseem");
		m1.put(2,"Saniya");
		m1.put(3,"Shabana");
		m1.put(4,"Meheruna");
		m1.put(5,"Anjum");
		m1.put(6,"Farru");
		
		System.out.println(m1);
		
		Map<Integer,String> m2 =new HashMap<>();
		
		m2.put(11,"Mohsin");
		m2.put(21,"Mubeen");
		m2.put(31,"Minhaj");
		m2.put(41,"Zakir");
		m2.put(51,"Majid");
		m2.put(61,"Faraz");
		System.out.println(m2);
		
		m2.putAll(m1);
		
		//m2.remove(21);
		//m2.replace(61, "Faraz", "Wajid");
		//String s=m2.get(61);
		
	  Set<Integer> key =m2.keySet();
	  Iterator<Integer>i1=key.iterator();
		while(i1.hasNext()) {
			Integer i=i1.next();
			
			System.out.println(i);
			if(i.equals(51)) {
			System.out.println(m2.get(i));
				break;
			}
			
		}
	}

}
