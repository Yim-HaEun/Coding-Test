
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			String s = scan.next();
			if(s.length()<=9 &&s.length()>=6) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
		
		scan.close();
	}
}