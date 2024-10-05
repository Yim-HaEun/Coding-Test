import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++) {
        	int a =scan.nextInt();
        	//100->4Q(25) 10->D 5->NK 1 ->P
        	int q = a/25;
        	int remain = a%25;
        	int d = remain/10;
        	remain %= 10;
        	int nk = remain/5;
        	int p = remain%5;
        	System.out.printf("%d %d %d %d\n",q,d,nk,p);
        	
        }
        scan.close();
    }
}