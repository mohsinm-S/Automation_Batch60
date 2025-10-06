package Test123;

public class Elseif {
	
	public static void main(String[] args) {
		
		int a=250;
		int b=45;
		int c=100;
		
		if(a>=b &&a>=c) {
			System.out.println(a+" =A is largsest than B"+b+" and c "+c);
		}
		else if(b>=a && b>=c) {
			
			System.out.println("B is largst than A and C");
		}
		else if(c>=a &&c>=b) {
			System.err.println("C is largst than A and B");
		}
	}

}
