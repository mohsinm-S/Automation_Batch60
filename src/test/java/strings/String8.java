package strings;

import java.util.Date;

public class String8 {

	public static void main(String[] args) {
		
		Date d=new Date();
		
	long time=d.getTime();
	System.out.println(time);
	
	Date d2=new Date(time+(1000*60*60*24*5));  // 1000*60*60*24*5 futuure time and pass time 
	String Dateformate=d2.toString();
	System.out.println(Dateformate);
	
	String month=Dateformate.substring(4,7);
	String date= Dateformate.substring(8,10);
	String year=Dateformate.substring(Dateformate.length()-4);
	
	String formate1=date.concat(month).concat(year);
	System.out.println(formate1);
	String formate2=date.concat("/").concat(month).concat("/").concat(year);
	System.out.println(formate2);
	
	String formate3=date.concat(" ").concat(month).concat(" ").concat(year);
	System.out.println(formate3);
	
	String formate4=month.concat("-").concat(date).concat("-").concat(year);
	System.out.println(formate4);
	
	String hour=Dateformate.substring(11,13);
	String minuts=Dateformate.substring(14,16);;
	String Sec=Dateformate.substring(17,20);
	
	String timeformate1=hour.concat(":").concat(minuts).concat(":").concat(Sec);
	System.out.println(timeformate1);
	
	String timeformate2=hour.concat(" ").concat(minuts).concat(" ").concat(Sec).concat("PM");
	System.out.println(timeformate2);

	}

}
