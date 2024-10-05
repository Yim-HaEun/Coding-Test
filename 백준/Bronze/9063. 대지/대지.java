import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int minA=10000;
        int minB = 10000;
        int maxA = -10000;
        int maxB = -10000;
        
        for(int i=0;i<n;i++) {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	if(a<minA) {
        		minA=a;
        	}if(a>maxA) {
        		maxA=a;
        	}
        	if(b<minB) {
        		minB=b;
        	}if(b>maxB) {
        		maxB=b;
        	}
        }
        System.out.println((maxA-minA)*(maxB-minB));
        scan.close();
    }
}