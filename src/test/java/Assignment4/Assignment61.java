package Assignment4;

public class Assignment61 {

	public static void main(String[] args) {
		int[] a= {1,2,3,40,5};
		int num=5;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) {
				System.out.println("Given number is present in the array index = "+i+ " Value "+a[i]);
			}
		}

	}

}
