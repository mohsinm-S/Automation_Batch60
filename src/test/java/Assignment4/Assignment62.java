package Assignment4;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment62 {

	public static void main(String[] args)  {
		int [] a= {1,5,1,5,6,3,8};
		int num=5;
		int count=0;

				
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) {
				count++;
				
			}
			}	
		
		
System.out.println("the given number is present in the array and count "+count +" : ");

Set<Integer> set=new HashSet<>();

for(int n : a) {
	set.add(n);
}
System.out.println(set);

int result[] =new int[set.size()];
int i=0;
for(int n:set) {
	
	result[i++]=n;
}
System.out.println(Arrays.toString( result));



 }
}