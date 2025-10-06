package d22092025;

public class NestedLoop {
	
	
	public static void loop1() {
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");		
			}
			System.out.println("");
		}
	
	}
	
	public static void loop2() 
	{
		for(int i=6;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");	
			}
			System.out.println(" ");	
		}
		
	}
	
	public static void loop3() 
	{
		for(int i=1;i<=6;i++) 
		{
			for(int j=i;j<=6;j++) {
				
				System.out.print(" ");	
			}
			
		     for (int k = 1; k <= (2 * i - 1); k++) {
			System.out.print("*");	
		}
		     System.out.println(" ");
			}
		
	}
	
	
	

	public static void main(String[] args) {
		loop1();
		loop2();
		loop3();
		
		
		
	}

}
