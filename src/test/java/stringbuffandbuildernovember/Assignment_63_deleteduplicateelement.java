package stringbuffandbuildernovember;

import java.util.Arrays;

public class Assignment_63_deleteduplicateelement {
 
	public static void main(String[] args) {
		
      int array[]=new int [6];
      array[0]=90;
      array[1]=6;
      array[2]=7;
      array[3]=7;
      array[4]=7;
      array[5]=7;
      
      System.out.println(Arrays.toString(array));
      
      boolean flag=false;
      
      int count=0;
      
      for(int i=0;i<array.length;i++)
      	{
      	for(int j=i+1;j<array.length;j++)
      	{
      	  		
      		
      		if(array[i]==array[j])
      		{
      			
      		System.out.println("Duplicate value from the array is=" +array[i]);
      		
      		
      		      
      		    array[i]=0;// mark duplicate
      		      count++;
      		       flag=true;
      		 }
      
      	}
      	
      	}
      System.out.println( Arrays.toString(array));
      
      
              if(flag==false)
              {
              	System.out.println("Duplicate value not found");
              }
              else {
              
              int result[] = new int[array.length-count] ;
              int index = 0;  // separate index for result array
              		
              for(int i=0;i<array.length;i++) {
            	  
            	  if(array[i]!= 0) {
            		  
            		  result[index] = array[i];
                      index++;
                      
             
            	  }
              }
              
              System.out.println(Arrays.toString(result));
              }
	}
}