package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Listprogram {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();

	for(int i=1;i<=6;i++) {
	
			list.add(i);
			
		}
		System.out.println(list);
		
		ListIterator<Integer>  it=	list.listIterator();
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

	
	
}
