
public class StudentMain {
 
	public static void main(String[] args) {
		Student s1=new Student(111,"Ram");
		Student s2=new Student(111,"Ram");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		boolean b =s1.equals(s2);
		System.out.println(b);
	}
}
