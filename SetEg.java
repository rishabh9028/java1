
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetEg {
public static void main(String[] args) {
	  LinkedHashSet<String> hs=new  LinkedHashSet<String>();
	
	hs.add("one");
	hs.add("two");
	hs.add("three");
	hs.add("one");
	for(String a:hs)
	{
		System.out.println(a); 
	}
	
}
}
