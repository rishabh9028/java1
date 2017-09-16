interface Bus
{
	void display();
}
interface Cycle
{
	void show();
}
interface Auto
{
	void call();
}

 class Vehicle2 implements Bus,Cycle,Auto{

	@Override
	public void display() {
		System.out.println("Auto interface call method");
		
	}

	@Override
	public void show() {
		System.out.println("Car interface call method");
		
	}

	@Override
	public void call() {
		System.out.println("Auto interface call method");
		
	}
	 

}
 class InterfaceExample
 {
	 public static void main(String[] args) {
		
	
	 Vehicle2 v=new Vehicle2();
	 v.call();
	 v.show();
	 v.display();
	 }
 }
