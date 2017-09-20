import java.util.Scanner;

public class Mains {
public static void main(String[] args) {
	System.out.println("Bank Application Details");
	System.out.println("------------------------");
	System.out.println("1.Bank Details");
	System.out.println("2.Account Details");
	System.out.println("3.Exit");
	Bank b=new Bank();
	 Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();
     System.out.println("Enter your choice:"+i);
     switch(i){
     case 1:
    	 System.out.println("Enter the Bank name");
    	 String cname=sc.next();
    	 b.setCname(cname);
    	 System.out.println("Enter the IFSC code");
    	 Integer ifsc=sc.nextInt();
    	 b.setIfsc(ifsc);
    	 System.out.println("Enter the branch location");
    	 String bname=sc.next();
    	 b.setBname(bname);
    	 System.out.println("Bank Details are:"+"\n"+"Bank Name:"+b.getCname()+""+"\n"+"IFSC code:"+b.getIfsc()+""+"\n"+"Branch location:"+b.getBname());
    	 break;
     case 2:
    	 System.out.println("Enter the Acc No");
    	 Integer accno=sc.nextInt();
    	 b.setAccno(accno);
    	 System.out.println("Enter the Acc Holder's Name");
    	 String accname=sc.next();
    	 b.setAccname(accname);
    	 System.out.println("Enter the Acc Type");
    	String acctype=sc.next();
    	 b.setAcctype(acctype);
    	 System.out.println("Account Details are:"+"\n"+"AccNo:"+b.getAccno()+""+"\n"+"Acc Holders Name"+b.getAccname()+""+"\n"+"Account type"+b.getAcctype());
    	 
    	 break;
     default :
         System.out.println("Invalid Choice"); 
     }
     
     
     
}
}
