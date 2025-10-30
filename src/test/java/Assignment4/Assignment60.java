package Assignment4;

public class Assignment60 {

	public static void main(String[] args) {
		int a[] = {4,5,25,36,7};
		int min=a[0];
		int max=a[0]; // assume 
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			
			if(a[i]<min) {
				min=a[i];
			}
		}
System.out.println("Max ="+max);
System.out.println("Min ="+min);
	}

}
