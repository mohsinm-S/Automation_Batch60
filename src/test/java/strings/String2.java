package strings;

public class String2 {
	String name="Mohammed Mohsin";  //instance varaible 
	
	public void concate()
	{
        		
		String before=name.concat(" Dr");
		System.out.println(before);

	}
 
	public void toUpperCase() 
	{
	
		String before= name.toUpperCase();
		System.out.println(before);
		
		
	}
	public void toLowerCase() 
	{
	
		String before= name.toLowerCase();
		System.out.println(before);
		
		
	}
	
	public void trim() 
	{
	   String name="   India Is my Contry     ";
		String after= name.trim();
		System.out.println(name);
		System.out.println(after);
		
		
	}
	public void chatAt() 
	{
	for(int i=0;i<5;i++) {
		char after= name.charAt(i);
		
		System.out.println(after);
		
	         }
	}
	
	
	
	public void Indexof() 
	{
	  
		int after= name.indexOf('n');
		
		System.out.println(after);
		
		
	}
	
	public static void main(String[] args) 
	{
	
		String2 st=new String2();
		st.concate();
		st.toLowerCase();
		st.toUpperCase();
		st.trim();
		st.chatAt();
		st.Indexof();
		
	}
	
	

}
