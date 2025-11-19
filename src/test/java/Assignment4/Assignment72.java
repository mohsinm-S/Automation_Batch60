package Assignment4;

import java.util.ArrayList;

import java.util.List;

//WAP using List Interface and Its Methods
public class Assignment72 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(45);
		list.add(46);
		list.add(50);
		
		System.out.println(list);
		
		
		List<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(20);
		list2.add(45);
		list2.add(46);
		list2.add(50);
		
		System.out.println(list2);
		
		boolean e=list.equals(list2);
		System.out.println(e);
		
		list2.add(5, 666);
		list2.removeAll(list);
		list2.set(0, 50);
		list2.addAll(list);
		
		
		for(int i=0;i<list2.size();i++) {
			
			if(list2.get(i).equals(666)) {
				System.out.println(list2.get(i));
			}
		
			
		}
		
		list2.addFirst(1000);
		list2.addLast(2000);
		
		
		System.out.println(list2);
		
		
	}

}
