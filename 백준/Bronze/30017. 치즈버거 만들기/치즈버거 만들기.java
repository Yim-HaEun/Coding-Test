import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int p = scan.nextInt();
		int c = scan.nextInt();
		int patty = 0;
		if(c>p) {
			patty = p;
			c=patty-1;
		}else if(c==p) {
			patty=c-1;
		}else if(c<p) {
			patty = c+1;
		}
		System.out.println(c+patty);
		scan.close();
	}
}