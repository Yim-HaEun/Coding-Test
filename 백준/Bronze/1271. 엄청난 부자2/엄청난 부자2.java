import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	BigInteger money = scan.nextBigInteger();
	BigInteger n = scan.nextBigInteger();
	BigInteger q = money.divide(n);
	BigInteger r = money.remainder(n);
	
	System.out.println(q);
	System.out.println(r);
	}
}