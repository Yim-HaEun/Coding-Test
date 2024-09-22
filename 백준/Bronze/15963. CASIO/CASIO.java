import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String m = scan.next();
		
		if(n.equals(m)) {
			System.out.print(1);
		
		}else{
			System.out.println(0);
		}
		
	}
}