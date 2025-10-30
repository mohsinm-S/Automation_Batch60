package strings;

public class String14 {

	public static void main(String[] args) {
		String name="I love mohammed ";
		String rev="";
  String[] st=name.split(" ");
  
  for(int i=st.length-1;i>=0;i--) {
	  
	String output=  st[i].toString();
	  System.out.println(output);
	  rev=rev+output+" ";

  }
		System.out.println(rev);
	}

}
