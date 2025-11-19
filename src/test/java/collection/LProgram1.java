package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LProgram1 {

	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("A", "B", "C");
		 
		 System.out.println(list);

		 for(int i=0;i<list.size();i++) {
			 
			 System.out.println(list.get(i));
		 }
		 
		 // For Each
		 System.out.println("For each");
		 for(String s:list) {
			 
			 System.out.println(s);
		 }
		 
		 //itreator
		 System.out.println("Iterator");
		 Iterator<String> mylist= list.iterator();
		 while(mylist.hasNext()) {
			 System.out.println(mylist.next());
		 }
		 
	}

}
