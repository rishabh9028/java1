import java.util.Scanner;
public class Test {

   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
	   String s = sc.nextLine();
	   
      s = s.concat(s);
      System.out.println(s);
    
      for (int i=0; i < s.length(); i++){
          if (i % 2 != 0){
         s = s.substring(0,i-1) + "#" + s.substring(i, s.length());
          }
       }
      		System.out.println(s);
      		
      	
      
      		  
      	      		
      		}
      		
      		
   }






   
