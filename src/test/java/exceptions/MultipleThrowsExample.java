package exceptions;

public class MultipleThrowsExample {

	  static void riskyOperation() throws Exception {
		  int result = 10 / 1; // ArithmeticException
	        String s = "";
	        System.out.println(s.length()); // NullPointerException
	        throw new Exception("Something went wrong in method1");
	  }
	public static void main(String[] args) throws Exception  {
		try {
		riskyOperation();
		}catch(Exception e) {
			 
		}finally {
			System.out.println("Finally block "); 
		}
	}

}
