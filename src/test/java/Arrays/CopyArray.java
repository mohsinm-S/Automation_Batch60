package Arrays;

import java.util.Arrays;

public class CopyArray {
	
	public static void main(String[] args) {
		int array1[] = {1,2,3,4,5};
				
		int array2[]=new int[array1.length];
		int array3[]=new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			
			array2[i]=array1[i];
		}
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
		for(int j=0,k=array2.length-1;j<array2.length;j++,k--) {
			
			array3[j]=array2[k];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		
	//	 Arrays.sort(array3);
	//	System.out.println(Arrays.toString(array3));
		
		boolean b1= Arrays.equals(array1, array2);
		if(b1==true) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Not equal");
		}
		
		
	}

}
