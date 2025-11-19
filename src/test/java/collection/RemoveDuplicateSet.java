package collection;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateSet {
	
	public static void main(String[] args) {
		
		 int array[]=new int [6];
	      array[0]=90;
	      array[1]=6;
	      array[2]=7;
	      array[3]=7;
	      array[4]=7;
	      array[5]=7;
	      
	      System.out.println(Arrays.toString(array));
	      
	      HashSet<Integer> set=new HashSet<>();
	      
	      for(Integer num:array) {
	    	  
	    	  set.add(num);
	      }
		System.out.println(set);
	}

}
