import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int time = scan.nextInt();
		c+=time;
		if(c>=60) {
			b+=c/60;
			c%=60;
		}
		if(b>=60) {
			a+=b/60;
			b%=60;
		}
		
		if(a>=24){
			a%=24;
		}
		
		System.out.printf("%d %d %d",a,b,c);
		
		scan.close();
	}
}