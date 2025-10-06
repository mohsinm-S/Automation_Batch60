package Class1709;

public class GBvariable {
	
	int accountbal;
	int salary;
	
static String name="Mallesham";

      String Fathername;


public static void bank1() {
	
	System.out.println(GBvariable.name); // Static globla varibale 
	
	GBvariable obj= new GBvariable();
	System.out.println(obj.salary=500); // non ststic global varibale
	System.out.println(obj.accountbal=9912535);
	
	
}
	public void bank2() {
		
		System.out.println(GBvariable.name="Mohsin"); // Static globla varibale 
		//GBvariable obj= new GBvariable();
		System.out.println(salary=200);
		System.out.println(accountbal=97042214);
		System.out.println(Fathername="bb");
		
	}
	
	
	void bank3() {
		
		name="Mohsin";
		String name="Mubeen"; // local variable 
		System.out.println(name);
	}
	
	public static void main(String[] args) {
	
		
		bank1();
		GBvariable obj= new GBvariable();
        obj.bank2();
        obj.bank3();
	}

}
