package Assignment3;

//WAP to make relationship between interface and interface


interface Remote
{
	void turnon();
	void turnoff();
	
}

interface SmartRemote  extends Remote

{

	void voiceControl();
	
}

 class SamsungRemote  implements SmartRemote  {

	

	@Override
	public void turnon() {
		System.out.println("Turn On by Manual remote");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Turnoff by Manual Remote ");
		
	}

	@Override
	public void voiceControl() {
		System.out.println("Controlled by voice ");
		
	}

	
}

public class Assignment41{
	public static void main(String[] args) {
		
	
	SamsungRemote  ss= new SamsungRemote ();
	ss.turnoff();
	ss.turnon();
	ss.voiceControl();
 }
}