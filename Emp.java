import java.util.Scanner;

public class Emp {

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the empId");
		int empId=sc.nextInt();
		
		System.out.println("Enter the empName");
		String empName=sc.next();
		
		System.out.println("Enter the salary");
		float sal=sc.nextFloat();
		
		System.out.println("Enter the grade");
		char grade=sc.next().charAt(0);
		
		System.out.println("Enter the phoneno");
		long phoneno=sc.nextLong();	
		
		System.out.println("The emp detials are:"+" "+"\n"+empId+" "+"\n"+empName
				+" "+"\n"+sal+" "+"\n"+grade+" "+"\n"+phoneno);
	}
	
	
	

}
