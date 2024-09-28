import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	for(int i=0;i<n;i++) {
    		for(int j=n-i-1;j>0;j--) {
    			System.out.print(" ");
    		}for(int k=0;k<=i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	for(int i=1;i<n;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.printf(" ");
    		}for(int k=n-i;k>0;k--) {
    			System.out.printf("*");
    		}
    		System.out.println();
    	}
    	scan.close();
    }
}