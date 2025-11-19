package Assignment4;

// WAP to demonstrate StringBuilder class using its methods

public class Assignment65 {

	public static void main(String[] args) {
		String name="Mohammed Mohsin";
	StringBuffer sb= new StringBuffer(name);
	sb.append(" Khan");
	System.out.println(sb);
	sb.reverse().toString();
	System.out.println(sb);
	
	}

}
