package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		v.capacity();
		v.addElement("Z - Mohammed mohsin");
		v.addElement("T - Mohammed Mubeen");
		v.addElement("Q - Mohammed Matheen");
		v.addElement("A - Mohammed Zakir khan");
		
		Enumeration<String> en =v.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
			
		}
	
	Collections.sort(v);
	
		System.out.println(v);
		Collections.reverse(v);
		System.out.println(v);
	}

}
