package strings;

public class ReversString {
	
	static void rev1() {
		String name="Mohsin";
		
		String rev="";
		int l=name.length();
		
		for(int i=l-1;i>=0;i--) {
			
			char c= name.charAt(i);
			rev=rev+c;
		
		}
		System.out.println(rev);
	}
	
	static void rev2() {
		String name="madam";
		String rev="";
	
		
		String[] st =name.split(" ");
		
		for(int j=0;j<st.length;j++) {
		
		
		char ch[] =st[j].toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			
			rev=rev+ch[i];
		
		}
		
		rev=rev+" ";
		}
		System.out.println(name);
		System.out.println(rev);
		
		if(name.equals(rev)) {
			System.out.println("Pallandrom");
		}else {
			System.out.println("Not Pallondrom");
		}
	}
	
	
	static void rev3() {
		
		String name="Mohammed Love I";
		String rev="";
	
		
		String[] st =name.split(" ");
		
		System.out.println(st.length);
		
		for(int i=st.length-1;i>=0;i--) {
		
		String s=String.valueOf(st[i]);
		rev=rev+s+" ";
		
		}
		
		System.out.println(rev+" ");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		rev2();
		rev3();
	}

}
