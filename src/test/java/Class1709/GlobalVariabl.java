package Class1709;

public class GlobalVariabl {
	
	int A=25652;;  
	static String name =null; //Global Variable 
	

	public static void add() {
		name="Majid";
		System.out.println("Gloaba : "+name);
	}
	
	void sub() {
		
		A=142;
		System.out.println(A);
	}
	
	public static void main(String[] args) {
		name="Mohsin";
		System.out.println("Gloaba : "+name);

		add();
		GlobalVariabl g=new GlobalVariabl();
		g.sub();
	}

}
