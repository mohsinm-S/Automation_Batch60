package assignments;

public class Assigment6 {

	public static void main(String[] args) {   //  Write a program on +,-,*,/ and % operators
		Assigment6 a6 =new Assigment6();
		
		a6.add(5, 10);
		a6.sub(2, 6);
		a6.mul(5, 5);
		a6.div(25, 5);
		a6.mod(255, 10);
	}
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	public void mul(int a,int b) {
		int mul=a*b;
		System.out.println(mul);
		
	}
	
	public void div(int a,int b) {
		int div=a*b;
		System.out.println(div);
		
	}
	public void mod(int a,int b) {
		int mod=a%b;
		System.out.println(mod);
		
	}

}
