import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double n = a*0.78;
		double m = a*0.8 + a*0.2*0.78;
		
		System.out.printf((long)n+" "+(long)m);

		scan.close();
	}
}