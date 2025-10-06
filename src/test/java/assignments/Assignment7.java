package assignments;

public class Assignment7 {

	public static void main(String[] args) {  //  WAP to check person can vote only if he/she is 18 or above and should not vote if age is less.

		int age=17;
	   char gender ='M';
	
	   if(age>=18 && gender=='M'||gender=='F') {
		   System.out.println("Person can vote");
	   }else {
		   System.out.println("Person is not eligible for vote");
	   }
	
		
	}

}
