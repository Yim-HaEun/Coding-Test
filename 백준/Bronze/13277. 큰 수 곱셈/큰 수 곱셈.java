import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	BigInteger a = scan.nextBigInteger();
	BigInteger b = scan.nextBigInteger();
	BigInteger r = a.multiply(b);
	System.out.println(r);
	
	}
}