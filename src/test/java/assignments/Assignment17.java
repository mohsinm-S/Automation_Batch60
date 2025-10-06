package assignments;

public class Assignment17 {
//WAP for Constructor(Parameterized / Non-Parameterized)
	
 
	public Assignment17(){   /// Non-Parameterized)
System.out.println("Non Parameterized constructor");
		
	}
	
	
	Assignment17(int a,int b){   //Parameterized
		
		int c=a+b;
		System.out.println("Parameterized constructor"+c);
	}
	public static void main(String[] args) {
		new Assignment17();
		new Assignment17(2,3);
		
	}

}
