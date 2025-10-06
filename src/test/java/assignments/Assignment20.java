package assignments;

public class Assignment20 {
//WAP for Global Variables
	
	static String name;
	static int age ;
	String dofb ;
	char gender;
	
	static void methodGV()
	{
		name="Saniya Tabasum";
		age=25;
		System.out.println(name);
		System.out.println(age);
		
		Assignment20 a20 =new Assignment20();
		String name1= a20.dofb="12/06/1999";
		int g=a20.gender='F';
		
		System.out.println(name1);
		System.out.println(g);
		
		System.out.println("***************");
		
	}
	 void methodGV2()
	{
		name="Mohsin";
		age=56;
		
		System.out.println(name);
		System.out.println(age);
		
		dofb="12/06/1988";
		gender='M';
		System.out.println(dofb);
		System.out.println(gender);
	}
	
	public static void main(String[] args) {
		
		methodGV();
		Assignment20  a20=new Assignment20();
		a20.methodGV2();
		
	}

}
