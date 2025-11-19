package collection;

import java.util.ArrayList;

public class Arralistprog3 {

	public static void main(String[] args) {

		ArrayList<Integer> al1= new ArrayList<>();
		
		al1.add(100);
		al1.add(222);
		al1.add(100);
		al1.add(100);
		al1.add(500);
		al1.add(500);
		al1.add(420);
		al1.add(500);
		
System.out.println(al1);


for(int i=0;i<al1.size();i++) {
	
	int count =1;
	if(al1.get(i)==0)
		continue;
	
	for(int j=i+1;j<al1.size();j++) {
		
		if(al1.get(i).equals(al1.get(j))) {
			count++;
			al1.set(j, 0);
		}
	}
	  System.out.println(al1.get(i) + " occurs " + count + " times");
}


	}

}
