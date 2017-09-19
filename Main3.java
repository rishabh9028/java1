import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
public static void main(String[] args) {
	ArrayList<Employee5> a1=new ArrayList<Employee5>();
	a1.add(new Employee5(101,"Amit",28000));
	a1.add(new Employee5(102,"Ajit",25000));
	a1.add(new Employee5(103,"Ajay",26000));
	Collections.sort(a1);
	for(Employee5 e:a1)
	{
		System.out.println(e);
	}
}
}
