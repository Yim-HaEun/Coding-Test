import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int s = scan.nextInt();
		System.out.println((s*2)-r1);
		
		scan.close();
	}
}