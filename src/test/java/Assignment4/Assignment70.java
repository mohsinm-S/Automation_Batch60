package Assignment4;

// WAP on Upcasting
class Teacher{

	public void java() {
		
		System.out.println("Java");
	}
	public void selenium() {
		
		System.out.println("Selenium");
		
	}
	
	public void subject() {
		System.out.println("By Mohsin");
	}
	
}
class student extends Teacher{
	
	public void name() {
		
		System.out.println("Student name");
	}
	
	
   public void subject() {
		System.out.println("By Manish");
	}
	
}
public class Assignment70 {

	public static void main(String[] args) {
		Teacher tc =new student();
			
		tc.selenium();
		tc.java();
		tc.subject();
		
		
		
	}

}
