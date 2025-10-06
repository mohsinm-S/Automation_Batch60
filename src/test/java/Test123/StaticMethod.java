package Test123;



public class StaticMethod {
	
	
	
	static void add() {
		System.out.println("Mohsin add method");
	}
	static void create() {
		System.out.println("VCreate Method");
	}

	static String update(String a) {
	System.out.println(a);
	return a;
		
	}
	public static void main(String[] args) {
		add();
		create();
		update("Mohsin");

	}

}
