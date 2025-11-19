package Assignment4;


//WAP to demonstrate Exception Handling using try-catch block
public class Assignment64 {

	public static void main(String[] args) {
	
		int a=10;
		try {
		int b=a/0;
		
		System.out.println(b);
		}catch(ArithmeticException e){
			System.out.println("Please use  >=1 value ");
			
		}finally {
			System.out.println("Close the DB connection");
		}
		
	}

}
