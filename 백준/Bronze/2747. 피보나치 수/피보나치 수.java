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
    	int[] f = new int[n+1];
    	f[0]=0;
    	f[1]=1;
    	for(int i=2;i<=n;i++) {
    		f[i]=f[i-1]+f[i-2];
    	}
    	return f[n];
    }
}