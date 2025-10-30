package Assignment3;

public class Assignment52 {

	public static void main(String[] args) {
		String name ="madam";
		String rev="";
				
		char ch[]=name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
		}

		System.out.println(rev);
		
		if(name.equals(rev)) {
			System.out.println("Given String is palindrome");
			
		}else {
			System.out.println("not a palindrome");
		}
	}

}
