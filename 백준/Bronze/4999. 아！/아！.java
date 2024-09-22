import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String frst = scan.nextLine();
	String sec = scan.nextLine();
	if(frst.contains(sec)) {
		System.out.println("go");
	}else {
		System.out.println("no");
	}
	
	}
}