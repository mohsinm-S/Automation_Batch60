package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;



public class O29 {
    public static void main(String[] args) {

   int a[] = {1,2,3,4,5,1,2,3};
   
   Set<Integer> set = new LinkedHashSet<>();
   
   for(int num:a) {
	   set.add(num);
   }
   System.out.println(set);
   
   int result[]= new int[set.size()];
   int i=0;
   for(int num :set) {
	   
	   result[i++]=num;
   }
    	System.out.println(Arrays.toString(result));
    }
}