package Test123;

class Switch1
{
	public void weekdays() {
		
		int name=12;
		
		switch(name) {
		case 1 : 
			System.out.println("Naseem");
			break;
		case 2 :
			System.out.println("Anjum");
			break;
		default : 
			System.out.println("no family");
			break;
		}
		
		
	}
}

class childswich extends Switch1
{
public void weekdays() {
		super.weekdays();
	System.out.println("no data");
	}
}

public class SwitchCases extends childswich {
	
		public static void main(String[] args) {

			childswich obj =new childswich();
			obj.weekdays();

			
	}

}
