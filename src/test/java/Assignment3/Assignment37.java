package Assignment3;
// Method Overrinding with super keyword

class Flipkart{
	
void login() {

	System.out.println("Login with Email");
	
}

}

class FilpkartLogin extends Flipkart{
	
	void login() {
		
		super.login();
		System.out.println("Login with Mobile number");
	}
	
}



public class Assignment37 {

	public static void main(String[] args) {
		FilpkartLogin f=new FilpkartLogin();
		f.login();

	}

}
