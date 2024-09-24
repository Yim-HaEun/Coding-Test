import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int j =0; j<n;j++) {
			for(int i =n-j;i>0;i--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scan.close();
	}
}