package strings;


public class String6 {

	public static void main(String[] args) {
		
		String name="Saniya Tabassum";
		
String[] parts=name.split(" ");

System.out.println(parts[0]);

for(String a:parts) {
	
	if(a.equals("Saniya")) {
	System.out.println(a);
	}
}
		
	}

}
