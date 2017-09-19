import java.util.ArrayList;
import java.util.Collections;

public class Collectioneg {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(5);
		a1.add(8);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(15);
		a2.add(24);
		a2.add(5);
		a2.add(7);
		a2.add(null);
		a1.addAll(a2);
		//a1.retainAll(a2);
		//a1.removeAll(a2);
		//Collections.sort(a1);
		for(Integer a:a1)
		{
			System.out.println(a); 
		}
	}

}
