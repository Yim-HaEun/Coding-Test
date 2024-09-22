import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();
		double r = a*b/2;
		System.out.printf("%.1f",r);
		scan.close();
	}
}