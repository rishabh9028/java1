import java.util.ArrayList;
import java.util.Collections;

public class main4 {
	public static void main(String[] args) {
		ArrayList<Employee5> a1=new ArrayList<Employee5>();
		a1.add(new Employee5(103,"mohit",2500));
		a1.add(new Employee5(101,"amit",25000));
		a1.add(new Employee5(102,"kiran",45003));
		Collections.sort(a1,new SortbyId());
		System.out.println("based on Employee id sorting");
		for(Employee5 e:a1)
		{
			System.out.println(e);
		}
		Collections.sort(a1,new SortbySalary());
		System.out.println("based on Salary  sorting");
		for(Employee5 e:a1)
		{
			System.out.println(e);
		}
	}

}
