import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int fir = B/100;	
		int th = (B%10);
		int sec =(B/10)-(fir*10);	
		System.out.println(A*th);
		System.out.println(A*sec);
		System.out.println(A*fir);
		System.out.println(A*B);
	}
}