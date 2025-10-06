package d3009;


abstract class  Loan
{
	abstract void customerDrtails() ; // 100% abstrction
	abstract void customerAddress() ;
	
}

abstract class bank extends Loan
{
	abstract void bankdetails() ;
	abstract void bankAddress() ;
}


public class AbstractClass extends bank {

	

	@Override
	void bankdetails() {
	System.out.println("ICICI Bank Details");
		
	}

	@Override
	void bankAddress() {
	
		System.out.println("ICICI Address Details");	
	}

	@Override
	void customerDrtails() {
		System.out.println("Customer Personal Details");
		
	}

	@Override
	void customerAddress() {
		System.out.println("Customer Address  Details");
		
	}
	public static void main(String[] args) {
		
		AbstractClass ac=new AbstractClass();
		ac.bankAddress();
		ac.bankdetails();
		ac.customerAddress();
		ac.customerDrtails();
	
	}
	

}
