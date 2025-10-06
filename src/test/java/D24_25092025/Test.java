package D24_25092025;


class Animal{
	
	public static void m1() {
		System.out.println("Method Static 1 is executed from Anaimal Class  ");
	}
	
	public  void m2() {
		System.out.println("Method non static 2 is executed from Anaimal Class  ");
	}
}

class Manal extends Animal{
	
	public static void m3() {
		System.out.println("Manal  ");
	}
	
	
}


class Dog extends Manal{
	
	
		public void m4() 
		{
			System.out.println("Dog ");
		}
		
	}









public class Test extends Dog {

	public static void main(String[] args) {
	
		Test t=new Test();
m1();
t.m2();
m3();

t.m4();

	}

}
