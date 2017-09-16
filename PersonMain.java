import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args){
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstname=sc.nextLine();
		p.setFirstname(firstname);
		System.out.println("Enter the last name");
		String lastname=sc.nextLine();
		p.setLastname(lastname);
		System.out.println("Enter the gender");
		char gender=sc.next().charAt(0);
		p.setGender(gender);
		System.out.println("The person details are:"+" "+"\n"+"______________________"+"\n"+"\n"+"First Name:"+p.getFirstname()+" "+"\n"+"Last Name:"+p.getLastname()
				+" "+"\n"+"Gender:"+p.getGender());
				
		
		
		
	}
}
