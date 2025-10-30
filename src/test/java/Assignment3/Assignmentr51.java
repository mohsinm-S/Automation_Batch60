package Assignment3;

public class Assignmentr51 {

	public static void main(String[] args) {
		String name="Mohsin";
		String rev=" ";
		char ch[] =name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
			
		}
		System.out.println("Reverse of String = "+rev);
	}

}
