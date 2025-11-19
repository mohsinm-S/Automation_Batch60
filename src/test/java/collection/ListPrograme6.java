package collection;

import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	int age;
	Employee(String name,int age){
		this.name=name;
		this.age=age;
		
	}
}


public class ListPrograme6 {

	public static void main(String[] args) {
		
		List<Employee> emp =new ArrayList<>();
		emp.add(new Employee("Mohsin",36));
		emp.add(new Employee("Saniya",26));
		
		for(Employee e:emp	) {
		System.out.println(e.name + " "+e.age);
		}
	}

}
