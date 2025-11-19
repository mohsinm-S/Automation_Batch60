package Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment68 {

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
		
	Iterator<Integer> it	=l1.iterator();
	 while (it.hasNext()) {
		 System.out.println(it.next());
	 }
		
		
	}

}
