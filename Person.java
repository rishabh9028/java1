
public class Person {
	
	private String firstname;
	private String lastname;
	private char Gender;
	
	Person()
	{
		
	}
	public Person(String firstname, String lastname, char gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		Gender = gender;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	

}
