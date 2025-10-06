package assignments;

public class Assignment11 {
//WAP to check condition statements  Nested if
	public static void main(String[] args) {

		int a=10;
		int b=9;
		int c=8;
		
		if(a>b) {
			
		System.out.println("a>b will be displayed 1");	
		
				if(b>c) {
					
					System.out.println("b>c will be displayed 2 ");
					
						if(a>c) 
						{
							System.out.println("a>c will be displayed 3");
							
							
						}
				}
			
			
		}else {
			System.out.println("Else will be displayed");
		}
		
		
	}

}
