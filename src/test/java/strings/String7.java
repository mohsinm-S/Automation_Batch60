package strings;

public class String7 {

	public static void main(String[] args) {
	String name="Mohammed Mohsin";
	
	String output=name.replace("M", "m");
        System.out.println(output);
        
    String o1=    name.replace("Mohsin", "Mubeen");
    	
        System.out.println(o1);
        
        
    String address ="# 9-85";
    
    String add1 =address.replaceAll("[0-9-]+", "85-96");
    System.out.println(add1);
    
    String add2 =address.replaceAll("[#]", "House No");
    System.out.println(add2);
    
    String Message="Verify the screenshot";
    
    String add3 =Message.replaceAll(" ", "_");
    System.out.println(add3);
    
    
    
    
	}

}
