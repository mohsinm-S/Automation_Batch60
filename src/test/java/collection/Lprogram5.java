package collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.BsonDecimal128;

public class Lprogram5 {
	// Merge two lista
	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList(1,2,3,4);
        List<Integer> b = Arrays.asList(1,2,3,4);

        a.retainAll(b);

        System.out.println("Common: " + a);
	}
}
