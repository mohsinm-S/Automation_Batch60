package Assignment3;

//WAP to make relationship between abstarct class and interface


interface Interface1
{

	void add(int a,int b);
}

abstract class Abstarctclass implements Interface1 {
	
	abstract void multi(int a,int b);
	
	void display() {
		System.out.println("50% of Abstarction ");
	}
	
}
public class Assinment40 extends Abstarctclass {

	  @Override
  public void add(int a, int b) 
	  {
	int c=a+b;
	System.out.println("Addition= "+c);
	
  }

  @Override
  void multi(int a, int b)
{
	int c=a*b;
	System.out.println("Multip = "+c);
	
  }
  
  public static void main(String[] args) {
	
	  Assinment40 a40 =new Assinment40();
	  
	  a40.add(4, 5);
	  a40.multi(5, 5);
	  a40.display();
   }
}
