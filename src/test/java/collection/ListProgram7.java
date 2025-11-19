package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
public class ListProgram7 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,3,2,5);
		List<Integer> result = new ArrayList<>();
		
		for(Integer l:list) {
			if(!result.contains(l)) {
				result.add(l);
			}
		}
System.out.println(result);



Set<Integer> set = new HashSet<>();

Set<Integer> dup = new HashSet<>();

for(Integer num:list) {
	if(!set.add(num)) {
		dup.add(num);
	}
}
System.out.println(dup);





	}
	
	
	

}
