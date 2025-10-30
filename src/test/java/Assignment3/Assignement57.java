package Assignment3;
// WAP to find out the average values which is present in array
public class Assignement57 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,6,8};
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
			
	}
int avg=sum/a.length;
System.out.println(avg);
}

	
}