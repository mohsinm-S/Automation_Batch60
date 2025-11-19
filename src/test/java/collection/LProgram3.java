package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LProgram3 {

	public static void main(String[] args) {
		
		//List To array
		
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		
	  Object[] a= list.toArray();
	  
System.out.println(Arrays.toString(a));


//Array to List

Integer[] avg= {20,21,22};

List<Integer> list2= Arrays.asList(avg);

System.out.println(list2);

	}

	
	
	
}
