import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		if(a==1) {
			System.out.println(0);
		}else {
			System.out.println(a*(a-1));
		}
	}		
}