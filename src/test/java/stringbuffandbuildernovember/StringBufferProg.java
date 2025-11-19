package stringbuffandbuildernovember;

public class StringBufferProg {
public static void main(String[] args) {
	
	String name="mohsin khan";
	
	StringBuffer sb=new StringBuffer(); // Non Param constructor
	StringBuffer a =sb.append(name).append(" khan ");
	System.out.println(a);
	
	System.out.println(sb.delete(0, 6));
	
	StringBuffer sb1=new StringBuffer(name);
	
	
	
	String substring=sb1.substring(2); // 
	System.out.println(substring);
	
	int int1=sb1.length();
	System.out.println("length= "+int1);
	
	int int2 =sb1.capacity();
	System.out.println(int2);
	
	StringBuffer sb3=new StringBuffer(name);
	
	String rev= sb3.reverse().toString();
	
	System.out.println(rev);
	String input="JAVA";
	StringBuffer sb4=new StringBuffer(input);
	
	System.out.println(sb4.insert(0, "CORE "));
	
}
}
