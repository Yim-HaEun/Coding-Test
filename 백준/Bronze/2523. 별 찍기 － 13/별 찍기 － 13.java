import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	for(int i=0;i<n;i++) {
    		for(int k=0;k<=i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	for(int i=1;i<n;i++) {
    		for(int k=n-i;k>0;k--) {
    			System.out.printf("*");
    		}
    		System.out.println();
    	}
    	scan.close();
    }
}