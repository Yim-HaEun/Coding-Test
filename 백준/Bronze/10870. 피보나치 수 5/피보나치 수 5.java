import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibo(n));
       
        scan.close();
    }
    public static int fibo(int n) {
    	if(n<=1) {
    		return n;
    	}
    	return fibo(n-1)+fibo(n-2);
    }
}