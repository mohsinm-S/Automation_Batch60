package assignments;

public class Assignment13 {
	// WAP for Logical operators ( && (AND) , || (OR)) 
	
	public static void main(String[] args) {
		
		int A=10;
		int B=20;
		int C=30;
		
					
		
	if(A>B &&A>C ) {
		
		System.out.println("Displaye A ="+A);
		
		}
	if(B>A || B>C) 
	{
		System.out.println("B Will be displayed = "+B);
		
	}
	
	if(C>A && C>B || C<A && C<B) 
	{
	System.out.println(" Block 3 will be displayed ");
	}

}
}
