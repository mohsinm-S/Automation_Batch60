package Arrays;

public class AvarageVlue {

	public static void main(String[] args) {
		int a[]= {8,6,6,85,96};
		
		double  avg=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];   
			
				
		}
		
		avg=sum/a.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
