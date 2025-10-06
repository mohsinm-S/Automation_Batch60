package d23092025;


class Amazon{
	
	Amazon(String product)
	{
		product="Electronic Items";
	System.out.println("Amazon Sale on ="+product);	
		
	}
	
	
}

class Flipkart extends Amazon{
	
	Flipkart(String product)
	{
		this(100);
		product="Only Mobile and Laptops";
		System.out.println("Flipkart Sale on ="+product);	
	}
	
	Flipkart(int item)
	{
		super("A");
		item=100;
		System.out.println("Flipkart Sale on ="+item);	
	}
}

class Meeshow extends Flipkart{
	Meeshow(String product)
	{
		super("A");
		product=" Cloths and Dress Matrial";
		System.out.println("Meeshow Sale on ="+product);
	}

}




public class Cons {

	public static void main(String[] args) {
		new Meeshow("A");

	}

}
