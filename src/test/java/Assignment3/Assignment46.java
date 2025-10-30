package Assignment3;

///WAP on Access Specifier for variables within the class

public class Assignment46 {
	
	public String name="mohsin mohammed";
	protected int amount=1000;
	 private String accountno="304143954241";
	  double price=12.23;
	 
	
	
	
	

	public static void main(String[] args) {
		Assignment46 a46 =new Assignment46();
		System.out.println(a46.accountno);
		System.out.println(a46.amount);
		System.out.println(a46.name);
		System.out.println(a46.price);
	}

}
