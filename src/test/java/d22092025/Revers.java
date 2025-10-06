package d22092025;

public class Revers {

	public static void main(String[] args) {
		
		int num=12345;
		int rev=0;
		for(int i=0;i<5;i++) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}
