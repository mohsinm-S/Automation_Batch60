package strings;

public class String3 {

	String name="Mohammed Mohsin";
	
	void substring(String name)
	{
		
		
		
	String a =name.substring(3);
	System.out.println(a);	
		
	}
	
	static void substring()
	{
		String3 obj=new String3();
		String a=obj.name.substring(0,2);
		System.out.println(a);	
	}
	
	
	
	public static void main(String[] args) {
		String3 obj1=new String3();
		substring();
		obj1.substring("indian");

	}

}
