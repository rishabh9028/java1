class Vehicle {
	String color="blue";
	
		void brake()
		{
			System.out.println("Super class Method");
		}
}
		 class Car extends Vehicle
		{
			String color="red";
			void gear()
			{
				System.out.println("Sub class Method");
				System.out.println(color);
				System.out.println(super.color);
			}
		}
		 class Bike extends Vehicle
		 {
			 
			
		 }
		  class InheritanceExample
		 {
			public static void main(String[] args) {
				Car c=new Car();
				Bike b=new Bike();
				Vehicle v=new Vehicle();
				c.brake();
				c.gear();
				 System.out.println(b instanceof Vehicle);
				 System.out.println(v instanceof Car);
				
			}
		}

	