import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			int dad = 0;
			int  child =0;
			int candy =scan.nextInt();
			int c = scan.nextInt();
			child = candy/c;
			dad = candy%c;
			System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n",child,dad);
		}
		scan.close();
	}
}