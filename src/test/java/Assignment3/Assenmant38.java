package Assignment3;

abstract class AbstarctTVClass{
	
	abstract void  tvturnon();
	
	
	
}

abstract class AbstarctACClass extends AbstarctTVClass{
	
	abstract void acturnoff();
	
	void display() {
		
		System.out.println("Display out put");
	}
	
	
}




public class Assenmant38 extends AbstarctACClass{

	

	@Override
	void acturnoff() {
		System.out.println("Turn Off Airconditions");
		
	}

	@Override
	void tvturnon() {
		System.out.println("Turn On Television");
		
	}
	
	public static void main(String[] args) {
		Assenmant38 a= new Assenmant38();
		a.display();
		a.acturnoff();
		a.tvturnon();

	}

}
