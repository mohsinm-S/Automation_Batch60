package Assignment3;
// WAP on Access Specifier for variables within the package

class VariableswithPackage
{
	public String name="mohsin mohammed";
	protected int amount=1000;
	 private String accountno="304143954241";
	  double price=12.23;
}


public class Assignment47 {

	public static void main(String[] args) {
		VariableswithPackage a47=new VariableswithPackage();
				
	
		System.out.println(a47.amount);
		System.out.println(a47.name);
		System.out.println(a47.price);

	}

}
