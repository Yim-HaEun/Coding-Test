import java.time.*;
import java.time.format.DateTimeFormatter;
public class Main {
	public static void main(String[] args){
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formatted =today.format(f);
		String result = formatted.replaceAll("-", "\n");
		System.out.println(result);		
		
	}
}