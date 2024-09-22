import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int i = scan.nextInt();
		int a = scan.nextInt();
		int r =scan.nextInt();
		int c = scan.nextInt();
		int first = h*i;
		int sec = a*r*c;
		System.out.println(first-sec);
		
		scan.close();
	}
}