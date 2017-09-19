
public class ExceptionEg {
	public static void checkAge(int age) {
		if(age < 19)
		{
			throw new ArithmeticException("Invalid Age");
		}
		else
		{
			System.out.println("Valid Age");
		}

	}
	public static void main(String[] args) {
		ExceptionEg.checkAge(16);
		/*try{
			int a[]=new int[5];
			a[6]=60;
			
			
			
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid Output");
			}
		finally
			{
				//System.exit(0);//to terminate finally block
				System.out.println("Always execute");
			}
	}*/
}
}
