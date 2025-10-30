package Arrays;

public class Vovels {

	public static void main(String[] args) {
		String name="Mohammed Mohsin";
		int con=0;
		int vol=0;
		char [] ch=name.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isAlphabetic(ch[i])) {
				
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
					vol++;
				}else {
					con++;
				}
			}
			
			
		}
System.out.println("Vowel = "+vol);
System.out.println("Cons = "+con);
	}

}
