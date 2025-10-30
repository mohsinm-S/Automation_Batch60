package exceptions;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		 String s = "ffeeddbbaaclck";
	char[] ch=s.toCharArray();
	char a=' ';
	
	for(int i=0;i<ch.length;i++) {
		boolean unique =true;
		
		for(int j=0;j<ch.length;j++) {
			if(i!=j &&ch[i]==ch[j]) {
				unique=false;
				break;
			}
			
		}
		if(unique) {
		System.out.println(ch[i]);
		break;
		}
	}
	
	
	
	
	}
	}