package Test123;

public class NonstaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonstaticMethods n= new NonstaticMethods();
		n.mohsin();
		
		NonSclass2 nsc2= new NonSclass2();
		nsc2.class1();
		nsc2.class1();
		
		NonSclass2.sClass();
		VowvelsConsonet vc= new VowvelsConsonet();
		vc.vowels();
		
	}
	
	
		public void mohsin() {
			
		System.out.println("mohsin is displayed");
	}

}
