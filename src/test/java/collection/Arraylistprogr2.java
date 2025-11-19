package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistprogr2 {
	public static void main(String[] args) {
		
	
	ArrayList<String> st1=new ArrayList<String>();

		st1.add("Mohsin");
	    st1.add("Amer");
	    st1.add("Mubeem");
	    
	System.out.println(st1);
	
	    for(int i=0;i<st1.size();i++) {
	    	if(st1.get(i).equals("Mohsin"))
	    	
	    	System.out.println(st1.get(i));
	    	
	    }
	    	
	    	

	    ArrayList<String> st2=new ArrayList<String>();

		st2.add("Arun");
	    st2.add("Kiran");
	    st2.add("Mohan");
	 
	   st2.addAll(0, st1);
	   st2.addAll(st1);
	   
	
	   System.out.println(st2);


	 
 }
}