import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class _05_PrintCurrentDateTime {

	public static void main(String[] args) {
		
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date date = new Date();
		
		System.out.println(format.format(date));
	}
}
