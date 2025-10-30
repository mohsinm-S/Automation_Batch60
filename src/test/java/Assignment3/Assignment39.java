package Assignment3;
// Interface

interface ICICIBank{
	
	void loan();
	
	void goldloan();
	
	void twowheelerloan();
	
}

interface HDFCBank{
	
	void loan();
	void fourwheelerloan();
	
	
}

class IndiaBranch implements ICICIBank,HDFCBank{

	@Override
	public void fourwheelerloan() {
		System.out.println("Four Wheeler Loan Facility in Hdfc bank ");
		
	}

	@Override
	public void loan() {
		System.out.println(" Loan @ Hdfc and ICIC bank");
		
	}

	@Override
	public void goldloan() {
		System.out.println("Gold Loan by ICICI Bank");
		
	}

	@Override
	public void twowheelerloan() {
		System.out.println("Two Wheel bike loan");
		
	}
	
	
}


public class Assignment39 extends IndiaBranch {

	public static void main(String[] args) {
		Assignment39 a39 = new Assignment39();

		a39.goldloan();
		a39.loan();
		a39.twowheelerloan();
		a39.fourwheelerloan();
	}

}
