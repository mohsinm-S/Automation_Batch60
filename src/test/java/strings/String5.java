package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String5 {

	public static void main(String[] args) {
		String message= "Your order has been placed successfully! Order ID: #AB12345xYZ";
		
		Pattern p= Pattern.compile("#.*[A-Z0-9]");
		Matcher matcher=p.matcher(message);
		
		if(matcher.find()) {
			
		String orderid=matcher.group();
		System.out.println(orderid);
		
		}
		}
	
	

	}


