package Assignment3;
// WAP to count the number of alphabets, numeric, spaces and special characters present in the String
public class Assignment59 {

	public static void main(String[] args) {
		
		String address ="HNo 9-85 & Post&Mandal Lpt 503111";
		int alphabet=0;
		int numeric=0;
		int spaces=0;
		int special=0;
		
		
		char[] ch=address.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
		if(Character.isAlphabetic(ch[i])) {
			alphabet++;
					
		}
		else if(Character.isDigit(ch[i])) {
			numeric++;
					
		}
		
		else if(Character.isWhitespace(ch[i])) {
			spaces++;
					
		}
		
		else if(!  	Character.isWhitespace(ch[i])) {
			special++;
					
		}
		 }
		System.out.println("Alphabets count = "+alphabet);
		System.out.println("Numeric count = "+numeric);
		System.out.println("Whitespace count ="+spaces);
		System.out.println("Speciacal  count "+special);
		
	}

}
