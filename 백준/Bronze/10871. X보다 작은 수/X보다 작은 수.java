import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		for(int i=1;i<=N;i++) {
			int a = scan.nextInt();
			if(a<X) {
				System.out.printf(a+" ");
			}
		}
		
	}
}