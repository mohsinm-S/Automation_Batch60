package Assignment3;
import java.util.Arrays;
//"WAP to copy the value of one array into another arrayInput=[1,2,3,4,5]
//Output=[1,2,3,4,5]"
public class Assignement54 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}

		System.out.println( Arrays.toString(a));
		System.out.println( Arrays.toString(b));
		
	}

}
