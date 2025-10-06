package D24_25092025;


	 class Vehicle  // Parent 
	{
		 static void types() {
			
			System.out.println("Vehicle Types two wheeles ");
		}
		
	}
	
	class TwoWheeler extends Vehicle{
		
		static void two() {
			System.out.println("Two Wheeler ");
		}
	}
	
	class FourWheeler extends Vehicle{
		static void four() {
			System.out.println("Four Wheeler ");
		}
	}
	
	
	class Bike extends TwoWheeler{
		static void bikes() {
			System.out.println("Normal Bike ");
		}
		
	}
	
	class Scoty extends TwoWheeler{
		static void scotys() {
			System.out.println("Scoty Wheeler ");
		}
	}
	
	class Shine extends Bike{
		
	}
	
	class Unicon extends Bike{
		
	}
	
	class Activa extends Scoty{
		
	}
	class Burgman extends Scoty{
		
	}
	
	
	class Diesel extends FourWheeler{
		
	}
	
	class Petrol extends FourWheeler{
		
		
	}
	
	class SwiftDesire extends Diesel{
		
	}
	
	class WagonR extends Petrol{
		
	}
	
	
	
	
	
	
	public class MotorMechanic  {
	
	
	
	public static void main(String[] args) {
		
		Vehicle.types();
	}

}
