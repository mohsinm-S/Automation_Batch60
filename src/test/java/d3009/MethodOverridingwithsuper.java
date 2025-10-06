package d3009;

class parent
{
 void login(String email )   //method overriding 
 {
	 System.out.println("Login with Email id "+email);
 }
 
}
class child extends parent
{
	
	void login(String mobile) //method overriding 
	 {
		super.login("mohammedmohsin109@gmail.com");  
		 System.out.println("Login with Mobile No"+mobile);
	 }	
}

public class MethodOverridingwithsuper extends child{

	
	
	public static void main(String[] args) {
		MethodOverridingwithsuper c=new MethodOverridingwithsuper();
	    c.login("9704221424");
	 

	}

}
