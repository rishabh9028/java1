import java.util.regex.*;

public class RegularExpressionEg {
	public static void main(String[] args) {
		//PATTERN
		String s="capgemini";
		String pattern="[a-z]{2,}";
		boolean b=Pattern.matches(pattern,s);
		System.out.println(b);
		
		String s1="9823223439";
		String pattern1="[789]{1}[0-9]{9}";
		boolean b1=Pattern.matches(pattern1,s1);
		System.out.println(b1);
		
		String s2="Capg";
		String pattern2="[A-Z]{1}[a-z]*";
		boolean b2=Pattern.matches(pattern2,s2);
		System.out.println(b2);
		
		String s3="1CapGemini";
		String pattern3="[0-9]{1}[A-Z]{1}[a-z]{2}[A-Z]{1}[a-z]*";
		boolean b3=Pattern.matches(pattern3,s3);
		System.out.println(b3);
		
		//MATCHER
		Pattern p=Pattern.compile("[0-9]{1}[a-zA-Z]{3,}");
		Matcher m=p.matcher("1abcAb");
		boolean b4=m.matches();
		System.out.println(b4);
		
	}
}
