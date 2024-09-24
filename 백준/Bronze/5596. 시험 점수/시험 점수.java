import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a =0;
		int b =0;
		for(int i =0;i<4;i++) {
			int n = scan.nextInt();
			a+=n;
		}
		for(int i =0;i<4;i++) {
			int n = scan.nextInt();
			b+=n;
		}
		if(a>=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}		
	}		
}