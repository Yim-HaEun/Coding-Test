import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n =scan.nextInt();
    	for(int i=0;i<n-1;i++) {
    		for(int j=n-i-1;j>0;j--) {
    			System.out.print(" ");
    		}
    		System.out.print("*");
    		for(int k=0;k<i;k++) {
    			System.out.print(" ");
    		}
    		for(int z =1;z<i;z++) {
    			System.out.print(" ");
    		}
    		if(i!=0) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	
    	for(int i=0;i<n;i++) {//바닥
    		System.out.printf("*");
    	}for(int j=0;j<n-1;j++) {
    		System.out.printf("*");
    	}
    	scan.close();
    }
}