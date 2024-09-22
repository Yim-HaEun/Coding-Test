import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a*100>=b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		scan.close();
	}
}