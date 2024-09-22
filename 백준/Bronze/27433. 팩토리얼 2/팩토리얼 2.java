
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		System.out.println(fac(f));
		
		scan.close();
	}
	public static long fac(int n) {
		if(n==0||n==1) {
			return 1;
		}else {
			return n*fac(n-1);
		}
	}
}