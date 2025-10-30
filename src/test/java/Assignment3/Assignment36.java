package Assignment3;
//Method Overriding


class Parent{
	
	public void Login() {
		
		System.out.println("Login With Email");
	}
	
   
	
	
}

class Child extends Parent{
	
	public void Login() {
		
		System.out.println("Login With Mobile number");
		
	}
	
	 
}

public class Assignment36 {

	
	
	public static void main(String[] args) {
	

		Child c=new Child();
		c.Login();
		
	}

}
