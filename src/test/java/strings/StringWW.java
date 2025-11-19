package strings;

public class StringWW {

	public static void main(String[] args) {
		String name="I Love Mohammed Mohammed";
		int count=1;
		String [] st=name.split(" ");
		
		boolean[] visted=new boolean[st.length];
		
		for(int i=0;i<st.length;i++) {
			
			if(visted[i]==true)
				continue;
			
			for(int j=i+1;j<st.length;j++) {
				
			
			if(st[i].equalsIgnoreCase(st[j])) {
				count++;
				visted[j]=true;
				
			}
			
			
			
		}
		System.out.println(st[i]+  "= "  +count);
		}
	
		

	}

}
