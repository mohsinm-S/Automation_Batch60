package Assignment4;
//WAP to demonstrate StringBuffer class using its methods
public class Assignment66 {

	public static void main(String[] args) {
		String name="Mohammed Mohsin";
		
		StringBuffer sb=new StringBuffer(name);
		sb.append(" Working as QA");
		sb.replace(0, 3, "MOH");
		sb.delete(0, 3);
	  
		System.out.println(sb);
		

	}

}
