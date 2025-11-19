package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgram2 {
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
	
	m2.putAll(m1);
	System.out.println(m2);
	
	//Set<Integer> k=m2.keySet();
	
	for(Integer mobile:m2.keySet()) {
		
		System.out.println(mobile);
	}
	
	Collection<String> col=m2.values();
	for(String val:m2.values()) {
		System.out.println(val);
	}
	
	
	Set<Entry<Integer ,String>> entry=m2.entrySet();
	
	System.out.println(entry);
   }	
}

