package collection;

public class FullPyramid {

	public static void main(String[] args) {
	 
		int n=5;
		
		for(int i=0;i<n;i++) {
			
					
			for(int sp=0;sp<n-i;sp++)
				
				System.out.print(" ");
			
			for(int st=0;st<2*i-1;st++)
				System.out.print("*");
			System.out.println();
		}
/// revers pyramid
		
		for(int i=n-1;i>=0;i--) {
			
			
			for(int sp=0;sp<n-i;sp++)
				
				System.out.print(" ");
			
			for(int st=0;st<2*i-1;st++)
				System.out.print("*");
			System.out.println();
		}
		
		
	}

}
