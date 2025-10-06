package d3009;
interface A2

{
	 String name="mohsin";
	void M1(int a);
	
}
interface A1
{
	void M2();
	
}

abstract class A3 implements A1,A2
{
	abstract  Void M3();
}

public class Program2 extends A3  {

	
	public static void main(String[] args) {
		Program2 b=new Program2();
		b.M1(100);
	}
	
	

	@Override
	public void M2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	Void M3() {
		return null;
		
	}

	@Override
	public void M1(int a) {
	System.out.println(name);
		
	}

}
