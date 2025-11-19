package Assignment4;

import java.util.ArrayList;
import java.util.List;

//WAP to Demonstrate the Use of ArrayList in Java

public class Assignment67 {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		
		list.add("Mohsin");
		list.add("Mubeen");
		list.add("Ramesh");
		list.add("Kiran");
		list.add("Kishore");
		
		System.out.println(list);
		
		List<String> list1 =new ArrayList<>();
		list1.add("GTM");
		list1.addAll(list);
		
		System.out.println(list1);

	}

}
