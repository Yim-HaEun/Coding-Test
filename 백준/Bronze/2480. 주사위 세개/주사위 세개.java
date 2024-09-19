import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int prize=0;
		int max = A;
		if(B>A) {
			max = B;
		}
		if(C>max) {
			max = C;
		}
		if(A==B&&A==C&&C==B) {
			prize= 10000+(A*1000);
		}else if(A==B || A==C && C!=B) {
			prize = 1000+(A*100);
		}else if(C==B && A!=C && A!=B){
			prize = 1000+(C*100);
		}else {
			prize=100*max;
		}
		System.out.printf("%d",prize);
	}
}