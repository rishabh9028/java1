enum gender
{
	M,F
}

public class EnumExample {
	public static void main(String[] args) {
		for(gender s:gender.values())
		System.out.println(s);
	}

}
