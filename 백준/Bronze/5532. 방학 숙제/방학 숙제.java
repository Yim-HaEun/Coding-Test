import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int a =scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		double k = a/c;
		if(a%c!=0) {
			k+=1;
		}
		double m = b/d;
		if(b%d!=0) {
			m+=1;
		}
	
		if(k>=m) {
			System.out.println(l-(int)k);
		}else {
			System.out.println(l-(int)m);
		}
	}		
}