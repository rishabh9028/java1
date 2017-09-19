import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		/*Scanner sc7=new Scanner(System.in);
		int n=sc7.nextInt();
		int x[]=new int[n];
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc7.nextInt();
		}
		Arrays.sort(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("After sorted"+x[i]);
		}
		int min=x[0];
		int max=x[x.length-1];
		System.out.println("middle element"+x[x.length/2]);
		System.out.println(min+max);*/
		int a[]={10,5,6,7};
		Arrays.sort(a);
		for(int out:a)
		{
			System.out.println(out);
		}
		
	}

}
