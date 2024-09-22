import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	BigInteger a = scan.nextBigInteger();
	BigInteger b = scan.nextBigInteger();
	BigInteger f = a.add(b);
	BigInteger s = a.subtract(b);
	BigInteger t = a.multiply(b);
	System.out.println(f);
	System.out.println(s);
	System.out.println(t);
	}
}