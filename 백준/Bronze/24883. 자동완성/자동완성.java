import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.equals("N")||s.equals("n")) {
			System.out.println("Naver D2");
		}else {
			System.out.println("Naver Whale");
		}
		scan.close();
	}
}