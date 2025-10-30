package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class MergeArrays {

	public static void main(String[] args) {
		int [] a= {2,3,5};
		int [] b= {1,4};
		int [] c= new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			
		}
		for(int j=0;j<b.length;j++) {
			c[a.length+j]=b[j];
		}
		System.out.println(Arrays.toString(c));
		for(int k=0;k<c.length;k++) {
			
			for(int l=k+1;l<c.length;l++) {
				
				if(c[k]<c[l]) {
				int temp =c[k];
				c[k]=c[l];
				c[l]=temp;
				
				}
			}
		}
		
		
		//Arrays.sort(c);
		///Arrays.sort(c,Collections.reverseOrder());
		System.out.println(Arrays.toString(c));

	}

}
