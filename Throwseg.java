import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Throwseg {
	public static void main(String[] args) throws ParseException {
		
			String s="10/12/2015";
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Date d1=sdf.parse(s);
			System.out.println(d1);
		
	}
}
