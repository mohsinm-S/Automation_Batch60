package Assignment5;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class A63 {
//WAP to remove duplicate elements from an array
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,4,6,6};
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==0)
				continue;
				
				if(a[i]==a[j]) {
					
					a[j] = 0  ;
					count++;
				System.out.println(a[i]);	
				}
				
			}
			
		}
System.out.println(Arrays.toString(a));


int result[] =new int[a.length-count];
int inx=0;
for(int i=0;i<a.length;i++) {
	
	if(a[i]!=0)
	{
	result[inx]=a[i];
	inx++;
	}
}


System.out.println(Arrays.toString(result));


	}

}
