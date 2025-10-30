package Arrays;

public class CounttheAlphabet {

	public static void main(String[] args) {
		String name="mohammed mohsin109 @!#*&";
		int alphbet=0;
		int number=0;
		int special=0;
		int Whitespace=0;
	char[] ch=name.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		
		if(Character.isAlphabetic(ch[i])) {
			
			alphbet++;
		}
		else if(Character.isDigit(ch[i])) {
			number++;
		}
		else  if(Character.isWhitespace(ch[i])) {
			Whitespace++;
		}
		else  if(!Character.isWhitespace(ch[i])) {
			special++;
		}
	}
	System.out.println("alphabet = "+alphbet);
	System.out.println("Number = "+number);	
	System.out.println("Spaces = "+Whitespace);	
	System.out.println("Special = "+special);	
	}

}
