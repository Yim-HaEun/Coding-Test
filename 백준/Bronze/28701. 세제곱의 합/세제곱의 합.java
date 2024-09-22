import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();//1100
		int f=0;
		double s=0;
		int t=0;
		for(int i=1;i<=a;i++) {
			f+=i;
		}
		s=Math.pow(f, 2);
		for(int i=1;i<=a;i++) {
			t+=Math.pow(i, 3);
		}
		System.out.println(f);
		System.out.println((int)s);
		System.out.println(t);
		scan.close();
	}
}