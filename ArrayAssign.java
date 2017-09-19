import java.util.ArrayList;
import java.util.Collections;

public class ArrayAssign {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Pencil");
	a1.add("Eraser");
	a1.add("Pen");
	a1.add("Sharpner");
	Collections.sort(a1);
	
	for(String a:a1)
	{
		System.out.println(a);
	}
	
}
}
