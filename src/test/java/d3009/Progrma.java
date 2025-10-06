package d3009;

interface AaP
{
	
	
	void login();
	void logout();
}
interface BaP {
	void search();
	
}
public class Progrma implements AaP,BaP {

	public static void main(String[] args) {
		Progrma p=new Progrma();
		p.login();
		p.logout();
		p.search();

	}

	@Override
	public void login() {
		System.out.println("Login Methods1");
		
	}

	@Override
	public void logout() {
		System.out.println("Login Methods2");
		
	}

	@Override
	public void search() {
		System.out.println("Login Methods3");
		
	}

}
