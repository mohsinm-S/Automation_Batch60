package D24_25092025;

 class BaseClass
{
	static void  lunchBrowser()
	{
	System.out.println("LunchBrowser ");	
	}
	
	static void quitBrowser()
	{
		System.out.println("Close or Quit the Browser");
	}
	 
}


public class TestCase1_SingleInheritence extends BaseClass {
	
  static void login()
  {
	System.out.println("Loginto the application");
  }
	
	public static void main(String[] args) {
		
lunchBrowser();
login();
quitBrowser();
		
	}

}
