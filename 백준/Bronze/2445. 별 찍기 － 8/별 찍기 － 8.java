import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    
    	for(int i=0;i<n;i++) {//역삼각형 9,7,5,3,1
    		for(int j=1;j<=i+1;j++) {
    			System.out.print("*");
    		}for(int k=n-1;k>i;k--) {
    			System.out.print(" ");//4321
    		}for(int z=n-1;z>i;z--) {
    			System.out.print(" ");//4321
    		}for(int y=1;y<=i+1;y++) {
    			System.out.print("*");
    		}
    		System.out.println("");
    	}
    	for(int i=1;i<n;i++) {//피라미드 4줄
    		for(int k=n;k>i;k--) {
    			System.out.print("*");
    		}for(int j=1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int y=1;y<=i;y++) {
    			System.out.print(" ");
    		}
    		for(int z=n;z>i;z--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	
    	}
    	scan.close();
    }
}