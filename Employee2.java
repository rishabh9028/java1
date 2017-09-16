
public class Employee2 {
	
	int empNo;
	String empName;
	static String compname="Capgemini";
	Employee2(int e,String n)
	{
		empNo=e;
		empName=n;
	}
	void display()
	{
		System.out.println(empNo+"  "+empName+" "+compname);
	}
	public static void main(String[] args){
		
		Employee2 e1=new Employee2(101,"Rishabh");
		Employee2 e2=new Employee2(102,"Mayur");
		e1.display();
		e2.display();
	}
	
	
	

}
