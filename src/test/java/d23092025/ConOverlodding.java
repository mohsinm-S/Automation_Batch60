package d23092025;

public class ConOverlodding {

	ConOverlodding()
	{
		this(35);
		String name="mohsin";
		System.out.println("Name ="+name);
	}
	
	ConOverlodding(int a)
	{
		this("father");
		System.out.println("Age ="+35);
	}
	ConOverlodding(String name)
	{
		
		System.out.println("Father Name="+name);
	}
	
	
	public static void main(String[] args) {
		new ConOverlodding();

	}

}
