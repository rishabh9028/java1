
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
public class dateExample {

	public static void main(String[] args) {
		
      LocalDate d=LocalDate.now();
      LocalDate d1=LocalDate.of(2016,Month.SEPTEMBER,21);
      System.out.println(d1);
      System.out.println(d.getYear());
      System.out.println(d.getMonth());
      System.out.println(d.getDayOfMonth());
      System.out.println(d.plusDays(2));
	  String s="2017/22/10";
	  DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/dd/MM");
	  LocalDate dd=LocalDate.parse(s,df);
	  System.out.println(dd);
	  
	}
	

}
