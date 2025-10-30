package Assignment3;

import java.util.Date;

// WAP to find out the hour,min and sec 
public class Assignment50 {

	public static void main(String[] args) {
		
		Date d1=new Date();
		d1.getTime();
		Date d2 =new Date(d1.getTime());
		
	    String s=	d2.toString();
		System.out.println(s);
		String hours=s.substring(10,13);
		String min=s.substring(14, 16);
		String sec=s.substring(17, 20);
		
		
	String time=hours.concat(":").concat(min).concat(":").concat(sec);
	System.out.println(time);

	}

}
