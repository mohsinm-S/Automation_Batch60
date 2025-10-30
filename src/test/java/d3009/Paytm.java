package d3009;

public class Paytm implements PaymentGetway {

	
	
	static double PreviousBalance =5000;
	static double AmountAdded;
	static double AmountSpent;
	static double TotalBalance=0;
	final static double discount=200;
	 
	
	
	public void payment(double AmountSpent)
	{
		if(PreviousBalance>=AmountSpent) {
		 
			 TotalBalance=PreviousBalance-AmountSpent;
			 System.out.println("Amount Has been debited from your account"+AmountSpent+"Your Total balance is "+TotalBalance);
		}else {
			System.out.println("Insufficent funds");
		}
	}

	public void refund(double AmountAdded)
	{
		TotalBalance=PreviousBalance+AmountAdded;
		System.out.println("Amount Has been Credited to your account :"+AmountAdded);
	}

	
	public void offer(double AmountSpent) 
	{
		
	
		if(AmountSpent>=2000) {
			System.out.println("200 Rs off on payment on 2000 and above offer applied");
		TotalBalance=PreviousBalance-(AmountSpent-discount);
		 System.out.println("Amount Has been debited from your account= "+TotalBalance);
		}
	}
	
public static void main(String[] args) {
		
	Paytm pt= new Paytm();
	
	pt.payment(6000);
	pt.refund(0);
	pt.offer(2000);
	pt.recharge(299);
	
	Paytm phone= new Paytm();
	phone.payment(2300);
	phone.refund(0);
	phone.offer(2300);
	
	phone.recharge(399);
	
	}


public void recharge(double plan) {
	
	if(PreviousBalance>=plan) {
	TotalBalance=PreviousBalance-plan;
   System.out.println("Recharge Sucessfull");
 
	}else {
		System.out.println("Insufficent funds");
	}
	}


}
