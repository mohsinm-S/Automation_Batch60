package collection;

import java.util.ArrayList;
import java.util.List;

public class ListProgram1 {

	public static void main(String[] args) {
		
		List<Integer> list1 =new ArrayList<>();
		
	    list1.add(100);
		list1.add(1, 10);
		System.out.println(list1);
		list1.addFirst(200);
	    list1.addLast(555);
	    
		System.out.println(list1);
		List<Integer> list2 =new ArrayList<>();
		
		list2.add(null);
		list2.addAll(0, list1);
		
		list2.addAll(list1);
		System.out.println(list2);
		
		boolean b= list2.equals(list1);
		System.out.println(b);
		
		list2.set(0, 0);
		System.out.println(list2);
		
		Integer l =list2.get(1);
		System.out.println(l);
		}

}
