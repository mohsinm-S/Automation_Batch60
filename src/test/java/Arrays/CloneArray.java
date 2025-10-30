package Arrays;
import java.util.Arrays;
public class CloneArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,5,3,6,8};
		int [] b;
		
		b=a.clone();
		//Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		

	}

}
