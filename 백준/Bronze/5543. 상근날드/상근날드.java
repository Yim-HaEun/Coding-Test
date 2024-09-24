import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int minb = 2500;
		int mind = 2500;
		for(int i=0;i<3;i++) {
			int n =scan.nextInt();
			if(n < minb){
				minb=n;
			}
		}
		for(int i=0;i<2;i++) {
			int d = scan.nextInt();
			if(d<mind) {
				mind =d;
			}
		}
		System.out.println(mind+minb-50);
		scan.close();
	}
}