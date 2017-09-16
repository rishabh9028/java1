
public class Student {
private int rollno;


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Studname == null) ? 0 : Studname.hashCode());
	result = prime * result + rollno;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (Studname == null) {
		if (other.Studname != null)
			return false;
	} else if (!Studname.equals(other.Studname))
		return false;
	if (rollno != other.rollno)
		return false;
	return true;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", Studname=" + Studname + "]";
}
public Student(int rollno, String studname) {
	super();
	this.rollno = rollno;
	Studname = studname;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getStudname() {
	return Studname;
}
public void setStudname(String studname) {
	Studname = studname;
}
private String Studname;
}
