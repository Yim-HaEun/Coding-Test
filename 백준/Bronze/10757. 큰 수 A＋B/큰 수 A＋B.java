import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	BigInteger  a = new BigInteger(scan.next());
	BigInteger b = new BigInteger(scan.next());
	
	BigInteger sum = a.add(b);
	System.out.println(sum);
	scan.close();		
	}
}