package strings;

public class String15 {

	public static void main(String[] args) {
		
		String name="mohsin";
		
		String a=name;
		
		name=name.concat(" khan");
		
		System.out.println(name);
		System.out.println(a);
		
		StringBuilder sb=new StringBuilder(name);
		String rev=  sb.reverse().toString();
		System.out.println(rev);
		
		
	}

}
