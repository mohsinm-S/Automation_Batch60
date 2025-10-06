package assignments;
//WAP for calling NonStatic method inside the same class
public class Assignment15 {
	
	
	void amazon() {
		System.out.println("Amazon App will be displayed ");
	}
	
	void flipkart() {
		System.out.println("Filpkart Offers should be displayed");
		
	}
	
	void ajio() {
		System.out.println("Ajio Cloths will be available ");
	}
	
	void onlineStore() {
		
	System.out.println("Online shopping done");
	}
	
	public static void main(String[] args) {
		
		Assignment15 a15 =new Assignment15();
		a15.amazon();
		a15.flipkart();
		a15.ajio();
		a15.onlineStore();
		
	}

}
