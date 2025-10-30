package strings;

public class String4 {

	static String name="Saniya Tabassume";
	
	static void contains()
	{
	boolean a=	name.contains("iya");
	System.out.println(a);
	}
	
	static void equals()
	{
		
		boolean a1=name.equals("Saniya Tabassume");
		System.out.println(a1);
	}
	
	static void matches()
	{
		boolean a2=name.matches("S(.*)");
		System.out.println(a2);
		
		String url="https://www.naukri.com/job-listings-qa-engineer-nationsbenefits-hyderabad-7to12 years";
		
		boolean u=url.matches("https://www.naukri.com/job-listings-qa-engineer-nationsbenefits-hyderabad-[a-z0-9].*");
		System.out.println(u);
		
	}
	
	public static void main(String[] args) {
	 contains();
	 equals();
	 matches();

	}

}
