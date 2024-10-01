import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    
    	for(int i =0;i<n;i++) {//역삼각형 9,7,5,3,1
    		for(int j=0;j<i;j++) {
    			System.out.print(" ");
    		}for(int k=n;k>i;k--) {
    			System.out.print("*");//54321
    		}for(int y=n-1;y>i;y--) {
    			System.out.print("*");//4321
    		}
    		System.out.println("");
    	}
    	for(int i=2;i<=n;i++) {//피라미드
    		for(int j=n;j>i;j--) {
    			System.out.print(" ");
    		}for(int k=0;k<i;k++) {
    			System.out.print("*");
    		}for(int y=0;y<i-1;y++){//0123
    			System.out.print("*");
    		}
    		System.out.println();
    	
    	}
    	scan.close();
    }
}