package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listprogrm3 {

	public static void main(String[] args) {
		List<String> list1 =new ArrayList<>();
		
            list1.add("Add");
            list1.add("Edit");
            list1.add("Delete");
            list1.add("Move");
            list1.add("Select");
            
          
           
          for(String st1:list1) {
        	   if(st1.equals("Add")) {
        		   
        		  System.out.println(st1);
        	   }
        	   
        	
           }
       String g= list1.getFirst();
         System.out.println(g);
	}

}
