
public class Employee5 implements Comparable<Employee5> {

	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employeee [eId=" + eId + ", Name=" + Name + ", salary=" + salary + "]";
	}
int eId;
String Name;
int salary;
	
	public Employee5(int eId, String name, int salary) {
		super();
		this.eId = eId;
		this.Name = name;
		this.salary = salary;
	}
	public int compareTo(Employee5 e) {
		if(salary == e.salary)
		{
			return 0;
		}
		else if(salary > e.salary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
}

	
