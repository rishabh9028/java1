class Addition
{
	int add(int a,int b)
	{
return a+b;
}
	int add(int a,int b,int c)
	{
return a+b+c;
}	
}
public class OverloadingExample {
public static void main(String[] args) {
	Addition a = new Addition();
	System.out.println(a.add(10,20));
	System.out.println(a.add(10, 20, 30));
	
}
	
}

