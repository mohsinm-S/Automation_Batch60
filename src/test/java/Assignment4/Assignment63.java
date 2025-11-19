package Assignment4;

import java.util.Arrays;

//WAP to remove duplicate elements from an array
public class Assignment63 {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,4,6,6};
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					a[j]=0;
					count++;
				}
				
			     }
			
			
		     }
		System.out.println(Arrays.toString(a));
	
		int result[] = new int[a.length-count];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				result[index]=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
