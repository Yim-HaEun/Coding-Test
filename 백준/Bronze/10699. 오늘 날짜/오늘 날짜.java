import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		String todayDate = d.format(today);
		System.out.println(todayDate);
	}	
}