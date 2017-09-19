import java.util.Comparator;

public class SortbyId implements Comparator<Employee5>{


	public int compare(Employee5 e1, Employee5 e2) {
		return e1.geteId()-e2.geteId();
		
	}
	

}
