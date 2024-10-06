import java.math.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String num = scan.next();
    	BigInteger n = new BigInteger(num);
    	BigInteger result = n.multiply(BigInteger.valueOf(4));
    	System.out.println(result);
    	scan.close();
    }
}