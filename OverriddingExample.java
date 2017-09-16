class Audi{
	
		public void speed()
		{
			System.out.println("Car class");
		}
	
}
class Lambporgi extends Audi
{
	public void speed()
	{
		System.out.println("Bike class");
	}
}
public class OverriddingExample {
	public static void main(String[] args) {
		Audi c=new Audi();
		Lambporgi b=new Lambporgi();
		b.speed();
		c.speed();
		
	}

}
