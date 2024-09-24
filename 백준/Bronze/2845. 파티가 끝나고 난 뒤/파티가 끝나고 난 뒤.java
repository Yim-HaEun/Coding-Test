import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int total = a*b;
		for(int i=0;i<5;i++) {
			int news = scan.nextInt();
			System.out.printf(news-total + " ");
		}
		
		scan.close();
	}
}