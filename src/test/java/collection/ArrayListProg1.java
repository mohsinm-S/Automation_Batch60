package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProg1 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al1= new ArrayList<>();
		
		al1.add(1);
		al1.add(222);
		al1.add(8);
		al1.add(6);
		al1.add(5);
		al1.add(99);
		
		
	
	
	
	ListIterator<Integer> lit=al1.listIterator();
	
	System.out.println("The list of itereator forworad");
	
	while(lit.hasNext()) {
	
		
		System.out.println(lit.next());
	}
	
	System.out.println("The list of itereator backword");
	
while(lit.hasPrevious()) {
	
		
		System.out.println(lit.previous());
		
	}
	

int a=al1.get(1);
	System.out.println(a);
	
	
	
	
	
	}

}
