package d3009;


class Parentmethod
{
	void setup()
	{
		System.out.println("Login with single  browsers");
	}
}

class Childmethod extends Parentmethod
{
	void setup()
	{
		System.out.println("Login with multiple browsers");
	}
}

public class Methodoverridings extends Childmethod {

	public static void main(String[] args) {
		Methodoverridings m=new Methodoverridings();
		m.setup();

	}

}
