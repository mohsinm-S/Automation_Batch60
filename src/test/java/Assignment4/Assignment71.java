package Assignment4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// WAP using Set interface and its Methods
public class Assignment71 {

	public static void main(String[] args) {
		
     Set<Integer> set=new HashSet<>();
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(2);
     set.add(45);
     set.add(46);
     set.add(50);
     

     
   boolean b1=  set.contains(50);
     System.out.println(b1);
     
  boolean b2 = set.isEmpty();
   
     System.out.println(b2);
     
  Iterator<Integer> it=   set.iterator();
     
  while(it.hasNext()) {
	  System.out.println(it.next());
  }
     
  
  set.remove(50);
  
  set.clear();
  
     System.out.println(set);
     
     
     
     
		
	}

}
