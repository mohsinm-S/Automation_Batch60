package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//WAP using ListIterator with its methods
public class Assignment69 {

	public static void main(String[] args) {
		
       List<Integer> l1 =new ArrayList<>();
		
		l1.add(12350);
		l1.add(12351);
		l1.add(12352);
		l1.add(12353);
		l1.add(12354);
		l1.add(12355);
		l1.add(12356);
		l1.add(12357);

		System.out.println(l1);
		
	ListIterator<Integer>	listit =l1.listIterator();
	System.out.println("Forword iteration");
	while(listit.hasNext()) {
		
		System.out.println(listit.next());
		
	}

	System.out.println("Backword Iteration");
	while(listit.hasPrevious()) {
		
		System.out.println(listit.previous());
	}
	
	}

}
