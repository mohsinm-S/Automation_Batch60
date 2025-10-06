package assignments;

public class Organizaton {

	
	void orgdetails()
	{
		System.out.println("Azaan International school");
	}
	
	void orgadd() 
	{
		System.out.println("Hyderabad");
	}
	
	public static void main(String[] args) {
		
		Student st=new Student();
		st.studentDetails("Mohammed mohsin", "HYD", "A Section", 7);
		st.bloodGroup("AB+");
		st.ParentDetails("Hansnoddin", "Naseem");
		
		
		st.studentDetails("Manish Kumar", "Bang", "B Section", 10);
		st.bloodGroup("o+");
		st.ParentDetails("Manish", "Manisha");
		
		
		Organizaton o=new Organizaton();
	
		o.orgdetails();
		o.orgadd();
	}

}
