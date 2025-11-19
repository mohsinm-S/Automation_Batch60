package Assignment4;

import java.util.Enumeration;
import java.util.Vector;

//WAP using Vector and demonstrate its methods and iteration using Enumeration

public class Assignment73 {
	
	public static void main(String[] args) {
		
		Vector<Character> v =new Vector<>();
		
		 v.add('A');
		 v.add('B');
		 v.add('C');
		 v.add('D');
		 v.add('E');
		 
		 

		 
		 v.capacity();
		 System.out.println(v.capacity());
		 
		 Enumeration<Character> emu	=v.elements(); 
		 while(emu.hasMoreElements()) {
			 System.out.println(emu.nextElement());
		 }
		
	 v.addElement('Z');
		
	 System.out.println(v);
	 
	}

}
