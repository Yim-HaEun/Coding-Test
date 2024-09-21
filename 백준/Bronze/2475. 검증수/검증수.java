import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		int answer =0;
		for(int i=0;i<5;i++) {
			int a = scan.nextInt();
			answer+= a*a;
		}
		System.out.println(answer%10);
	}
}