import java.util.Scanner;

public class Details {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String firstname=sc.nextLine();
		System.out.println("Enter the last name");
		String lastname=sc.nextLine();
		System.out.println("Enter the gender");
		String gender=sc.next();
		System.out.println("Enter the age");
		int a=sc.nextInt();
		System.out.println("Enter the weight");
		float weight=sc.nextFloat();
		
		System.out.println("The person details are:"+" "+"\n"+"__________________"+"\n"+"\n"+"First Name:"+firstname+" "+"\n"+"Last Name:"+lastname
				+" "+"\n"+"Gender:"+gender+" "+"\n"+"Age:"+a+" "+"\n"+"Weight:"+weight);
		
		
	}
}
