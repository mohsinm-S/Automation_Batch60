package Test123;

public class VowvelsConsonet {
	
	
	public void vowels() {
		
		String name="Mohammed Mohsin Khan Ul Bari";
		name .toLowerCase();
		int vow=0;
		int cons=0;
				
				char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++ ) {
		
		//if(ch[i] >='a' && ch[i] <= 'z') {
			if(Character.isAlphabetic(ch[i])) {
			
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					
					vow++;
					
				}
		   }else {
			   cons++;
		   }
		
	    }
		System.out.println("vowles : "+vow);
		System.out.println("consonent :"+cons);
	}
}
