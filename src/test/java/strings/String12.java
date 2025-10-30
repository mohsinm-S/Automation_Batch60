package strings;

public class String12 {

	public static void main(String[] args) {
		
		String name="dad";
		String rev="";
		char[] ch=name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			rev=rev+ch[i];
		}
		System.out.println(rev);
		
		if(name.equals(rev)) {
			System.out.println("pallendrom");
			
		}else {
			System.out.println("Not pall");
		}
	}
}
