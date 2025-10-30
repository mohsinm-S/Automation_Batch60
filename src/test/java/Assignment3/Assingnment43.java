package Assignment3;

//WAP on Access Specifier for methods within the Package

class NewClass{
	
	public void m1_public() {
		System.out.println("Public method with pakage");
	}
    private void m2_Private() {
		System.out.println("Private method with pakage");
		
	}
    protected void m3_Protected() {
		System.out.println("Protected method with pakage");
    }
     void m4_defalut() {
 		System.out.println("Defalut method with pakage");;
     }
     
}

public class Assingnment43  {

	public static void main(String[] args) {
		
		NewClass a43=new NewClass();
		a43.m1_public();
		a43.m3_Protected();
		a43.m4_defalut();
		
		
		
		

	}

}
