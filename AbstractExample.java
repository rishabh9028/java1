
abstract class Shape{
	
	abstract void display1();
	abstract void show();
	void call()
	{
		System.out.println("Concrete Method");
	}

}
class Circle extends Shape
{
	
	@Override
	void display1() {
		System.out.println("display circle");
		
	}

	@Override
	void show() {
		System.out.println("show circle");
		
	}
}
	class AbstractExample
	{
		public static void main(String[] args) {
			Shape s=new Circle();
			s.display1();
			s.show();
		}
	}


	

