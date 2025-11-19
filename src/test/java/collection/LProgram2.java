package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;

public class LProgram2 {

	public static void main(String[] args) {
		 List<String> Alist = Arrays.asList("A", "B", "C","D");
		 
	List asc=new ArrayList(Alist);
		 
Collections.sort(asc);

List desc=new ArrayList(Alist);

Collections.reverse(desc);

System.out.println(Alist);
System.out.println(asc);

if(Alist.equals(asc)) {
	System.out.println("acending");
}else if(Alist.equals(desc))
{
	System.out.println("desc");
}else {
	System.out.println("not matched");
}

	}

}
