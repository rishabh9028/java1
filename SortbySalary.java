
import java.util.Comparator;

public class SortbySalary implements Comparator<Employee5>{


	public int compare(Employee5 e1, Employee5 e2) {
		return (int) (e1.getSalary()-e2.getSalary());
		
	}
	

}
